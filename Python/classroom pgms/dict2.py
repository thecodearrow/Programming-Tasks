"""
Define a  function which contains a dictionary that has names and grades stored as "Key-Value" pairs.
Pass a list that contains 5 names as an arguement to the function.
Display grades for the names in the list.
If the name is not available, print "New Entry" and accept the new grade for the particular name from the user. 

"""


def printGrade(l):
	dict={ "Prashanth": "O",
	"George": "A",
	"Martin": "B",
	"Stephen":"C",
	"Joffrey": "F",
	"Stark":"A",
	"Daniel":"A",
	"Tyrion":"O",
	"Henry":"A",
	"Larry":"O"
	}

	for item in l: 
 		if(item in dict):
 			print(item,": ",dict[item])
 		else:
 			print("New Entry to be added for ", item)
 			grade=input("Please enter grade: ")
 			dict[item]=grade;
 			print("Entry successfully added! ")



l=[] #empty List 


#Input names
print("Please enter 5 names: ")
for i in range(5):
	l.append(input())


printGrade(l)