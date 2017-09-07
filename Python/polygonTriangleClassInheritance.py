"""TO calculate the area of a Triangle using class Inheritance"""
import math
class Polygon:
	def __init__(self,number):
		self.no_of_sides=number;
		self.sides=[] #list containing the sides

	def input_sides(self):
		for i in range(1,self.no_of_sides+1):
			print("Enter side",i)
			side=int(input())
			self.sides.append(side)

	def print_sides(self):
		print("The sides are: ")
		num=1
		for i in self.sides:
			print("Side",num,": ",i)
			num=num+1


class Triangle(Polygon):
	def __init__(self,number):
		super().__init__(number)

	def findArea(self):
		side1=self.sides[0]
		side2=self.sides[1]
		side3=self.sides[2]
		s=(side1+side2+side3)/2
		area=math.sqrt(s*(s-side1)*(s-side2)*(s-side3))
		print("The area is ", area)






def main():
	t=Triangle(3)
	t.input_sides()
	t.print_sides()
	t.findArea()




if __name__ == '__main__':
	main()