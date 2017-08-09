"""

Python program to  sort the list of tuples in increasing order of the last element in each tuple

"""

def sort_tuple_easy(tuple_list1):

	s=sorted(tuple_list1,key=lambda x:x[-1])
	return(s)


def sort_tuple(tuple_list):
	"""
  function that sorts the list of tuples in increasing order of the last element in each tuple

	"""

	sorted_tuple_list=[]
	last_elements=[]  #list containing last elements of each tuple

	l=len(tuple_list) #Length of the list
	

	#Creating a list containing last elements of each tuple only
	for i in range(l):
		last_elements.append(tuple_list[i][-1])

	last_elements.sort() #Sorts the list

	#Sorting the whole tuple list according to the sorted last_elements list
	for i in range(l):
		for j in range(l):
			if(last_elements[i]==tuple_list[j][-1]): 
				sorted_tuple_list.append(tuple_list[j])
		

	return(sorted_tuple_list)




tl=[(1,7),(1,3),(3,4,5),(2,2)]
print("Tuple List: ", tl)
print("The sorted list is: ", sort_tuple(tl))
t=[(2,3),(1,1),(5,6),(1,0)]
print(sort_tuple_easy(t))
