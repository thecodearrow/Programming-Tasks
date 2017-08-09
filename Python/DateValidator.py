"""
A Python Program that validates a date entered in the format DD/MM/YYYY
"""

import re #Import RE module

def dateValidate(date):
	if not re.match("^([0-2][1-9]|[1-3][0-1])/([0][1-9]|[1][0-2])/(\d{4})$",date):
		print("Invalid Date Format");
	else:
		print("Valid Date Format");



dateValidate("00/03/1997")  #Valid
dateValidate("15/08/1947")  #Valid
dateValidate("01/02/128") #Invalid
dateValidate("date 01/03/1997") #Invalid
dateValidate("01/03/1997 date") #Invalid
dateValidate("19/6/3000")   #Invalid, should be 06 
dateValidate("01/03/97")    #Invalid, should be 1997
dateValidate("33/03/1997")  #Invalid
dateValidate("00/03/1997")  #Invalid
dateValidate("01/15/1997")  #Invalid