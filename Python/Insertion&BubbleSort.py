

"""
A Python Program to sort the given list using Insertion Sort & Bubble Sort

"""

def insetion_sort(list1):
	""" 
   Function that returns a sorted list using Insertion Sort

	"""

	n=len(list1) #Length of the list
	for i in range(1, n):
		j=i-1
		key=list1[i]
		while(list1[j]>key and j>=0):
			list1[j+1]=list1[j]
			j-=1 #Decrementing j
		list1[j+1]=key

	return(list1)




def bubble_sort(list2):
	"""
	Function that returns a sorted list using Bubble Sort

	"""

	n=len(list2) #Length of the list

	for i in range(0, n-1):
		for j in range(0, n-i-1):
			if(list2[j]>list2[j+1]):
				list2[j], list2[j+1]= list2[j+1], list2[j] #Swapping the numbers 


    

	return(list2)


l=[]; #empty list

print("Please enter the numbers of a list: (type 'end' when finished)")

s=input() #First input 
while(s != "end"):
	l.append(int(s))  #converting from string to int
	s=input()         #Continue accepting more numbers...

print("Your unsorted list is: ", l)
print("List sorted using Insertion Sort: ", insetion_sort(l))
print("List sorted using Bubble Sort: ", bubble_sort(l))