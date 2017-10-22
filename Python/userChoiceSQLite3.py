"""

Allowing the user to make changes to library.db

"""

import sqlite3 

def user_choice():
	#User defined choices to query the database
	

	#Exception handling for the sqlite connection
	try:
		conn=sqlite3.connect('library.db')
		c=conn.cursor()  #cursor object

		
		print("TABLE BOOKS(Before)")
		c.execute("SELECT * FROM BOOKS;")
		print(c.fetchall()) #Fetches the query result

		further='T' #decides no. of times user wants to query

		while(further=='T'):
			print('Enter 1 to INSERT, 2 to UPDATE, 3 to DELETE')
			choice=input()
			if(choice=='1'): #insert
				print("Please enter details to insert into BOOKS")
				book_id=input("Enter Book ID:")
				title_id=input("Enter Title_ID:")
				loc=input("Enter Location:")
				genre=input("Enter Genre:")
				#Inserting values into BOOKS
				query="INSERT INTO BOOKS VALUES('{0}','{1}','{2}','{3}')".format(book_id,title_id,loc,genre)
				#can also use VALUES(?,?,?,?)
				c.execute(query)
				print("Insertion Successful!")
				
		

			elif(choice=='2'): #update
				print("Please enter details to update BOOKS")
				book_id=input("Enter Book ID:")
				loc=input("Enter new Location to be updated:")
				query="UPDATE BOOKS SET LOCATION='{0}' WHERE BOOK_ID='{1}'".format(loc,book_id)
				print("Update Successful!")
				c.execute(query)
				
			

			elif(choice=='3'): #delete
				book_id=input("Enter the BookID that needs to be deleted: ")
				query="DELETE FROM BOOKS WHERE BOOK_ID='{0}'".format(book_id)
				c.execute(query)
				print("Deletion Successful!")
				
			else:
				print("Invalid choice Hermano!")

			print("Do you wish to continue[T/F]?")
			further=input()

		



		conn.commit() #committing changes


		print("TABLE BOOKS(AFTER)")
		c.execute("SELECT * FROM BOOKS;")
		print(c.fetchall()) #Fetches the query result



	except sqlite3.Error as e:
		print("There was a problem! ", e)

	finally:
		if conn:
			conn.close() #if conn was established, finally close it



user_choice()
