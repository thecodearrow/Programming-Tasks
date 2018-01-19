#include <iostream>
#include<vector>
#include<math.h>
using namespace std;
int main()
{
  int i1,i2;
    cin>>i1>>i2;
  vector<int> armstrong;
 
  for(int i=i1+1;i<i2;i++){
  string s=to_string(i);
  int sum=0;
  for(int j=0;j<s.length();j++){
  int digit=(int)s[j]-48;
  sum=sum+pow(digit,s.length());
  }
  if(sum==i){
  armstrong.push_back(i);
  }
  }
  
  cout<<"Armstrong numbers between "<<i1<<" and "<<i2<<" are: \n";
  
  for(int i=0;i<armstrong.size();i++){
  cout<<armstrong[i]<<" \n";
  }
  

  return 0;
}