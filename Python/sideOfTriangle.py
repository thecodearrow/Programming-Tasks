"""

Program to compute the third side of a triangle when two sides and an angle are given

"""

import math as m

a=float(input("Enter side A: "))
c=float(input("Enter side C: "))
angle_b=int(input("Enter angle b in degrees: "))
angle_b_rad=m.radians(angle_b)
b=m.sqrt(a**2+c**2-(2*a*c*m.cos(angle_b_rad)))

print("The third side is: ", b)