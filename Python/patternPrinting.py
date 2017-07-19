"""

Program to print the given pattern using nested for loops

"""


n=int(input("Enter the no. of lines: "))

for i in range(0,n):
	for j in range(0,2*i):
		print("\\",end="")
	for k in range(0,(4*(n-i)-2)):
		print("!",end="")
	for j in range(0,2*i):
		print("/",end="")
	print("") #Prints newline


""" 
Without using nested for loops 

for i in range(0,n):
	print("\\" * 2*i,end="")
	print("!" * (4*(n-i)-2),end="")
	print("/" * 2*i)
	
"""

