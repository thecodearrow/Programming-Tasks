//TCP HALF DUPLEX CLIENT SERVER PROGRAM

#include<stdio.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<unistd.h>

int main(){

	int s=socket(AF_INET,SOCK_STREAM,0);
	struct sockaddr_in sadd;
	sadd.sin_family=AF_INET;
	sadd.sin_port=htons(1999);
	sadd.sin_addr.s_addr=inet_addr("127.0.0.1");


	//bind
	bind(s,(struct sockaddr*)&sadd,sizeof(sadd));
	listen(s,1);

	struct sockaddr_in cadd;
	socklen_t clen=sizeof(cadd);
	int a=accept(s,(struct sockaddr*)&cadd,&clen);
	if(a<0){

		printf("FAILED!");

		return 0;
	}

	while(1){

		char m[1000],b[1000];
		FILE* f=fopen("npp.txt","r");
		fgets(b, sizeof(b), (FILE*)f);
		printf("%s",b);

	}


	close(s);
	return 0;

}