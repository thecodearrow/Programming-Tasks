
"""Write a TCP/IP server and client program. It is a echo client program. The message typed
by the client should be echoed back to the client by the server.""" 



import socket
import time

def main():
	host='127.0.0.1'
	port=5000
	s=socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	s.connect((host,port)) #takes arg as a tuple of host,port

	message=input("Enter message to be sent: ")
	while message!='q': #accepts message till q is pressed
		s.send(message.encode()) #encoding message before sending it
		print("Message has been sent!")
		time.sleep(5)
		data=s.recv(1024).decode() #Received from server echoed data and decoding
		print("Received back from server: "+str(data))
		print("Message echoed successfully...")
		message=input("\nEnter message to be sent:  ")

	s.close() #closes socket


if __name__ == "__main__":
	main()
