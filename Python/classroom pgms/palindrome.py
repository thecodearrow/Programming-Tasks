"""
Program to check if a given string is a palindrome or not!

"""


string=input("Enter string: ")

string_rev=string[::-1]
if(string==string_rev):
	print("Palindrome")
else:
	print("Not Palindrome")