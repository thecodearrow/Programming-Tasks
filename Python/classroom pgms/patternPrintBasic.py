"""

To print the following pattern: 

n=5

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

"""


n=int(input('Enter number of lines:'))
count=1;
for i in range(n+1):
	for j in range(i):
		print(count,end=" ")
		count=count+1
	print();


