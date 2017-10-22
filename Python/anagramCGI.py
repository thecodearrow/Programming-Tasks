#!/usr/bin/python3
"""Web Application to check if two strings are anagrams of each other using CGI Scripting"""

# Import modules for CGI handling 
import cgi, cgitb 

#Function
def anagramCheck(s1,s2):
	"""Takes two strings and checks if they are anagrams of each other"""
	#Removes whitespaces and converts to lower case
	s1=s1.replace(" ","").lower() 
	s2=s2.replace(" ","").lower() 
	#Sorting the strings
	s1=''.join(sorted(s1))
	s2=''.join(sorted(s2))
	return s1==s2

#Creating a form for textboxes

# Create instance of FieldStorage 
form = cgi.FieldStorage() 


# Get data from fields
if(form.getvalue('first_string') and form.getvalue('second_string' )): #if the values are loaded
	first_string = form.getvalue('first_string')
	second_string = form.getvalue('second_string')
	result=anagramCheck(first_string,second_string) #Stores true or false

print ("Content-type:text/html\r\n\r\n")
print ("<html>")
print ( "<head>" )
print ( "<title>Anagram Checker</title>" )
print ( "</head>" )
print ( "<body>" )
print ( "<h2>Anagram Checker</h2>" )
print ( '<form action="/home/prashanth/anagramCGI.py" method="get">' )
print ( 'String1: <input type="text" name="first_string">  <br />' )
print ( 'String2: <input type="text" name="second_string" />' )
print ( '<input type="submit" value="Submit" />' )
if(form.getvalue('first_string') and form.getvalue('second_string' )): #if the values are loaded
	print ( '<h3>Result: %s' % (result) )
print ( '</form>' )
print ( "</body>" )
print ( "</html>" )