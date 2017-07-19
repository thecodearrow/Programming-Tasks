# Below is code that creates a list of four items,
# represented as dictionaries specifying each item's
# color and size.
# Add code to ask for a number, then print the color of all
# items whose size is greater than that number.



items = [{'color':'red', 'size':10}, {'color':'blue', 'size':3},
         {'color':'green', 'size':15}, {'color':'yellow', 'size':6}]

input=int(input("Enter size: "))

colour_list=[]

for item in items:
	if(input<item["size"]):
		colour_list.append(item["color"])


print("The colour list is: ", colour_list)



