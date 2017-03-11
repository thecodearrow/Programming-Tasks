#include <iostream>
#include<vector>
#include<math.h>

using namespace std;


int main() {
    int t=0,i,j,m,n,k;
    vector<int> prime_list(1000,1);
    prime_list[0]=0;  //As 0 & 1 are not prime
        prime_list[1]=0;
cin>>t;

if(t<=10){
    for(k=1;k<=t;k++) //Number of test cases times
    {
        cin>>m>>n;

    for(i=2;i<sqrt(n);i++)
    { if(prime_list[i]==1) //if it is not struck off already
        {
            for(j=2;i*j<=n;j++)
                prime_list[i*j]=0; //Now strike off further
        }
    }

    for(i=m;i<=n;i++)
    {   if(prime_list[i]==1)
        cout<<i<<endl;

    }

    }
}


return 0;
    }
