"""
Adds/ Subtracts two given times using operator overloading
"""


from datetime import timedelta 
class Time:
	def __init__(self,hours=None,minutes=None,seconds=None):
		self.hours=hours
		self.minutes=minutes
		self.seconds=seconds

	def input_values(self):
		self.hours=int(input("Enter the hours: "))
		self.minutes=int(input("Enter the minutes: "))
		self.seconds=int(input("Enter the seconds: "))

	def print_details(self):
		print ("{0}:{1}:{2}".format(self.hours,self.minutes,self.seconds))

	def __add__(self,other):
		#Calculation steps
		t=timedelta(hours=self.hours,minutes=self.minutes,seconds=self.seconds)+timedelta(hours=other.hours,minutes=other.minutes,seconds=other.seconds)
		total_seconds=t.seconds % (24*60*60) #ensuring the number of seconds don't exceed 1 day
		new_minutes,new_seconds=divmod(total_seconds,60)
		new_hours,new_minutes=divmod(new_minutes,60)
		return Time(new_hours,new_minutes,new_seconds)


	def __sub__(self,other):
		#Calculation steps
		t=timedelta(hours=self.hours,minutes=self.minutes,seconds=self.seconds)-timedelta(hours=other.hours,minutes=other.minutes,seconds=other.seconds)
		total_seconds=t.seconds
		new_minutes,new_seconds=divmod(total_seconds,60)
		new_hours,new_minutes=divmod(new_minutes,60)
		return Time(new_hours,new_minutes,new_seconds)






t1=Time()
print("\nValues for t1: ")
t1.input_values()
t2=Time()
print("\nValues for t2: ")
t2.input_values()
t3=t1+t2
t4=t1-t2
t3.print_details()
t4.print_details()






