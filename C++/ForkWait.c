/*To create child processes and make the parent process wait for the completion of the child processes. */


#include<stdio.h>
int main(){
	

int pid1,pid2,i,j;
pid1=fork();
if(pid1>0){

/*Parent Process*/
i=wait(0);
printf("Child Process %d\n",i);
}

if(pid1==0){

   printf("Child Process 1 running with ID %d\n", getpid());

}

pid2=fork();

if(pid2>0){

/*Parent Process*/
j=wait(0);
printf("Child Process %d\n",j);
}

if(pid2==0){

   printf("Child Process 2 running with ID %d\n", getpid());

}

if (pid1<0|| pid2<0){
printf("Fork Error\n");

}

return 0;



}
