l=[1,2,3,4]
s=[2,3]



def isSubList(l,s):
	"""To check if s is a sublist of l"""
	check=True
	idx=-1

	#Test Cases

	if(len(s)==0): #s with no elements
		return "True"
	if(len(s) == len(l)): #len(s) equal to len(l)
		return l==s
	if(len(s) > len(l)): #len(s) should not exceed len(l)
		return "False"




	first=0
	if(s[0] in l): 
		first=l.index(s[0]) #Starting l from that index instead
	last=len(l)
	

	for i in range(first,last):
		idx+=1
		if(idx<len(s)):  
			if(l[i]!=s[idx]):
				check=False
			
		

	if(check==True):
		return "True"
	else:
		return "False"



""" A much simpler solution 

def isSubList(l,s):
	return set(s) <= set(l)


"""
print(isSubList(l,s))   #Calling the function





