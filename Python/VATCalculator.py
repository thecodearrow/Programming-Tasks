"""
Program that computes the net amount and VAT amount and displays result to the user
"""


amt=float(input("Enter the gross amount of purchase: "))
vat_percent=float(input("Enter the VAT percentage: "))
vat_amt= (vat_percent/100)*amt
net_amt=amt+vat_amt

print("VAT amount is: ", vat_amt)
print("The computed net amount is: ", net_amt)