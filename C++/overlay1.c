#include<stdio.h>
#include <unistd.h>

int main(){

printf("Main Program ");
printf("Process Id: %d \n", getpid());
execl("/home/prashanth/Desktop/overlay2","overlay2.out",NULL);
printf("This line will NOT execute...");


return 0;
}
