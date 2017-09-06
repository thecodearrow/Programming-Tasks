class Student:

	@staticmethod
	def factoryMethod(type):
		if(type=="UG"):
			return UG();
		if(type=="PG"):
			return  PG();


class UG(Student):
	def display(self):
		print("UG Student");



class PG(Student):
	def display(self):
		print("PG Student");



object=Student.factoryMethod("UG");
object.display();
