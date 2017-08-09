
""" 
Program to compute the difference between book prices and display the output.

"""


price_outlet=int(input("Enter average price of the book at outlet: "))
price_online=int(input("Enter average price of the book if bought online: "))
diff=price_outlet - price_online
print("Difference between outlet and online price = ", diff) 