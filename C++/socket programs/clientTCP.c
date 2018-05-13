

//TCP HALF DUPLEX CLIENT SERVER PROGRAM
#include<stdio.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<unistd.h>
int main(){

int s=socket(AF_INET,SOCK_STREAM,0);
struct sockaddr_in sadd;
sadd.sin_addr.s_addr=inet_addr("127.0.0.1");
sadd.sin_family=AF_INET;
sadd.sin_port=htons(1999);

int c=connect(s,(struct sockaddr*)&sadd,sizeof(sadd));

while(1){

char m[1000],b[1000];
printf("File name enter kar!\n");
fgets(m,sizeof(m),stdin);
send(s,m,sizeof(m),0);
printf("Message has been sent!\n");
recv(s,b,sizeof(b),0);


printf("File reads: %s \n",b);


}

close(s);

return 0;

}