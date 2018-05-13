#include<stdio.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<unistd.h>
#include<time.h>
#include<string.h>
int main(int argc,char* argv[]){

int s=socket(AF_INET,SOCK_DGRAM,0);
struct sockaddr_in sadd;
sadd.sin_family=AF_INET;
sadd.sin_addr.s_addr=inet_addr("127.0.0.1");
sadd.sin_port=htons(1999);


time_t t=time(NULL);
char m[1000];
strcpy(m,ctime(&t));


sendto(s,m,sizeof(m),0,(struct sockaddr*)&sadd,sizeof(sadd));
printf("Current Date-Time sent!\n");


}