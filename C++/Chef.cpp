/*

Chef's daily routine is very simple. He starts his day with cooking food, then he eats the food and finally proceeds for sleeping thus ending his day. Chef carries a robot as his personal assistant whose job is to log the activities of Chef at various instants during the day. Today it recorded activities that Chef was doing at N different instants. These instances are recorded in chronological order (in increasing order of time). This log is provided to you in form of a string s of length N, consisting of characters 'C', 'E' and 'S'. If s[i] = 'C', then it means that at the i-th instant Chef was cooking, 'E' denoting he was eating and 'S' means he was sleeping.

You have to tell whether the record log made by the robot could possibly be correct or not.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains string s.

Output
For each test case, output a single line containing "yes" or "no" (without quotes) accordingly.

Constraints
1 T 20
1 N 105

TEST CASE 1 
INPUT

2

CES

CS

OUTPUT

yes

yes
TEST CASE 2
INPUT

2

CCC

SC

OUTPUT

yes

no
*/


#include <iostream>
using namespace std;
int main()
{	int T;
 	cin>>T;
 	if(T>=1 && T<=20){
 	for(int i=0;i<T;i++){
    	string s;
    	cin>>s;
    	int flag=1;
    	int N=s.length();
    	if(N>=1 && N<=105){
    		for(int index=0;index<N;index++){
    			if(s[index]=='E'){
           	 		if(index+1!='\0'){
            			if(s[index+1]=='C'){
            				flag=0;
            			}
            
           			}
            	}
              	
              	if(s[index]=='S'){
                	if(index+1!='\0'){
                    
                    	if(s[index+1]=='E' || s[index+1]=='C'){
                        flag=0;
                        }
                    
                    }
                
                }
            }
    		if(flag==0){
            cout<<"no"<<"\n";
            }
            if(flag==1){
            cout<<"yes"<<"\n";
            }
    		}
    
    	
      }
    }
	return 0;
}