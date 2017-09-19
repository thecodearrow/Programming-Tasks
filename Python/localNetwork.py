import threading
import time
import os
import re

def pingNetwork(threadName,IPAddr):
	"""Determines in a local network which addresses are active"""
	f=os.popen("ping -c 1 "+IPAddr) #pinging 1 packet to the IP
	time.sleep(1) #suspends thread for 1 sec
	for line in f:
		if  re.search(".* 0% packet loss",line): #if the packet loss is 0% then the network is active
			print(IPAddr," ACTIVE")
			break


	




#Input from user
ip1=input("Enter IP Address 1: ")
ip2=input("Enter IP Address 2: ")
ip3=input("Enter IP Address 3: ")

#Creating 3 threads
t1=threading.Thread(target=pingNetwork,args=("Thread-1",ip1,))
t2=threading.Thread(target=pingNetwork,args=("Thread-2",ip2,))
t3=threading.Thread(target=pingNetwork,args=("Thread-3",ip3,))
t1.start()
t2.start()
t3.start()
