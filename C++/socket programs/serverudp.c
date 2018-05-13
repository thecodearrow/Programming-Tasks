#include<stdio.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<unistd.h>
#include<string.h>
#include<time.h>
int main(int argc,char* argv[]){



int s=socket(AF_INET,SOCK_DGRAM,0);
struct sockaddr_in sadd;
sadd.sin_family=AF_INET;
sadd.sin_addr.s_addr=inet_addr("127.0.0.1");
sadd.sin_port=htons(1999);
bind(s,(struct sockaddr*)&sadd,sizeof(sadd));
listen(s,1);
struct sockaddr_in cadd;
socklen_t clen=sizeof(cadd);


char m[100];
recvfrom(s,m,sizeof(m),0,(struct sockaddr*)&cadd,&clen);
printf("%s",m);


close(s);

}