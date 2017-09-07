
def subStringSearch(str,substr):
	"""Finds and lists index positions of the substring and also number of occurrences"""
	indexPosition=[]
	i=0
	start=0
	while True:
		i=str.find(substr,start)
		start=i+1
		if i==-1:
			break
		indexPosition.append(i)


	print("The index positions are:",indexPosition)
	print("The number of occurrences are",len(indexPosition))
	#print("The number of occurrences are",str.count(substr))



string1=input("Enter the string: ")
string2=input("Enter the substring: ")
subStringSearch(string1,string2)