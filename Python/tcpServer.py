"""Write a TCP/IP server and client program. It is a echo client program. The message typed
by the client should be echoed back to the client by the server.""" 


import socket
import threading 
import time



host='127.0.0.1' 
port=5000
s=socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((host,port)) #takes arg as a tuple of host,port
s.listen(1)
connection,addr=s.accept()

while(True):
		data=connection.recv(1024).decode() #Receiving data from client and decoding it
		if not data:
			break
		print("Received from client:  "+str(data))
		echo_data=data
		s=connection.send(echo_data.encode())  #Sending data to clent

connection.close() #Closes connection
s.close() #Closes

