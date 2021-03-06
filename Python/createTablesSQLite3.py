"""

Table CREATION-- Books,Titles,Publishers,Zip Codes, Authors Titles, AUthors

"""

import sqlite3 

def create_table():


	#Exception handling for the sqlite connection
	try:
		conn=sqlite3.connect('library.db')
		c=conn.cursor()

		#CREATING TABLES 

		c.execute('CREATE TABLE ZIPCODES(ZIP_CODE_ID TEXT PRIMARY KEY NOT NULL,CITY TEXT,STATE TEXT,ZIP_CODE INT)')
		c.execute('CREATE TABLE PUBLISHERS(PUBLISHER_ID TEXT PRIMARY KEY NOT NULL,NAME TEXT,STREET_ADDRESS CHAR(50),SUITE_NUMBER INT,ZIP_CODE_ID INT NOT NULL,FOREIGN KEY(ZIP_CODE_ID) REFERENCES ZIPCODES(ZIP_CODE_ID));') 
		c.execute('CREATE TABLE TITLES(TITLE_ID TEXT PRIMARY KEY NOT NULL,TITLE TEXT,ISBN INT,PUBLISHER_ID TEXT NOT NULL,PUBLICATION_YEAR INT,FOREIGN KEY(PUBLISHER_ID) REFERENCES PUBLISHERS(PUBLISHER_ID));') 
		c.execute('CREATE TABLE BOOKS(BOOK_ID TEXT PRIMARY KEY NOT NULL, TITLE_ID TEXT NOT NULL,LOCATION TEXT,GENRE TEXT,FOREIGN KEY(TITLE_ID) REFERENCES TITLES(TITLE_ID));') 
		c.execute('CREATE TABLE AUTHORS(AUTHOR_ID TEXT PRIMARY KEY NOT NULL, FIRST_NAME TEXT,MIDDLE_NAME TEXT,LAST_NAME TEXT')
		c.execute('CREATE TABLE AUTHOR_TITLES(AUTHOR_TITLE_ID TEXT PRIMARY KEY NOT NULL, AUTHOR_ID TEXT,TITLE_ID TEXT,FOREIGN KEY(TITLE_ID) REFERENCES TITLES(TITLE_ID),FOREIGN KEY(AUTHOR__ID) REFERENCES AUTHORS(AUTHOR_ID))'),

		conn.commit() #committing changes

	except sqlite3.Error as e:
		print("There was a problem! ", e)

	finally:
		if conn:
			conn.close() #if conn was established, finally close it



	












