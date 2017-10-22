"""Write a tkinter program to edit the phone list. Create the below form. This application
requires creating a SQLite table called “PhoneList” with Phone_number (Primary Key)
and Name as the columns."""


from tkinter import *
import sqlite3




#Exception Handling for sqllite

try:

	#SQLite3 Connection
	conn=sqlite3.connect('phonelist.db')
	c=conn.cursor() 


	#Creating TABLE PHONELIST
	c.execute('CREATE TABLE IF NOT EXISTS PHONELIST(NAME TEXT,PHONE TEXT PRIMARY KEY NOT NULL);')


	#Tkinter GUI 
	root = Tk()
	Label(root, text="Name").grid(row=0)
	Label(root, text="Phone").grid(row=1)


	#Initial Display
	data=c.execute("SELECT * FROM PHONELIST;")
	fetch=data.fetchone(); #fetches the first entry only

	e1 = Entry(root) 
	e1.insert(0,fetch[0]) #name Entry
	e2 = Entry(root) 
	e2.insert(0,fetch[1]) #phone Entry

	e1.grid(row=0, column=1)
	e2.grid(row=1, column=1)

	#ListBox with scrollbar

	
	
	L = Listbox(root)
	s = Scrollbar(root)
	L.grid(row=4,columnspan=3)

	s.config(command=L.yview)

	L.config(yscrollcommand=s.set)
	s.grid(row=4,column=2)
	



	

	#Button functions
	def add():
		#adds records into the database
		name=e1.get() #gets_name
		phone_no=e2.get() #gets phone number
		c.execute("INSERT INTO PHONELIST VALUES(?,?);",(name,phone_no)) #placeholder with tuple as second arguement
		print("Data inserted!")
		conn.commit()  #Committing changes! 


	def update():
		#updates records in database when name is updated
		updated_name=e1.get()
		phone_no=e2.get()
		c.execute("UPDATE  PHONELIST SET NAME=? WHERE PHONE=?;",(updated_name,phone_no))
		print("Data updated!")
		conn.commit()


	def delete():
		#deletes selected record from database
		phone_no=e2.get() 
		c.execute("DELETE FROM PHONELIST WHERE PHONE=?;",(phone_no,))
		print("Data deleted!")
		conn.commit()  #Committing changes! 
		


	def load():
		L.delete(0,END) #clearing the listbox before loading
		data=c.execute('SELECT * FROM PHONELIST;');
		

		#Storing from database into a list
		for row in data:
			value=row[0]+', '+row[1]
			L.insert(END,value) #inserts value into listbox

	


	
	def onselect(evt):
		
		#Storing from database into a list
		data=c.execute('SELECT * FROM PHONELIST;');
		namesList=[]
		phoneList=[]
		for row in data:
			namesList.append(row[0])
			phoneList.append(row[1])

		w = evt.widget
		index = int(w.curselection()[0])
		e1.delete(0, END)
		e2.delete(0,END)
		e1.insert(0,namesList[index])
		e2.insert(0,phoneList[index])
			



    	







	load() #loading listbox with values the first time!


	L.bind('<<ListboxSelect>>', onselect) #on select event trigger


	#Buttons
	Button(root, text='Add', command=add).grid(row=3, column=0, sticky=W, pady=4)
	Button(root, text='Update', command=update).grid(row=3, column=1, sticky=W, pady=4)
	Button(root, text='Delete', command=delete).grid(row=3, column=2, sticky=W, pady=4)
	Button(root, text='Load', command=load).grid(row=3, column=3, sticky=W, pady=4)

	



	

	mainloop( )

except Exception as e:
	print("There was a prob uh-oh! ",e)