#include <iostream>
using namespace std;

int main() {
	string str,sub;
	cin>>str;
	cin>>sub;
	//cout<<str<<" "<<sub;
	int ind,len,flag,k;
	len=str.length();
	ind=0;
	bool found=false;
	while(str[ind]!='\0')
	{
	    flag=1;
	        for(int ctr=0;ctr<sub.length();ind++,ctr++)
	        {
	           if(str[ind]!=sub[ctr]){   
	               flag=0; 
	               break;
	           }
	           //cout<<str[ctr]<<"=="<<sub[k]<<endl;
	        }
	   if(flag==1)
	   {
	       cout<<ind-sub.length();
	       found=true;
	       break;
	   }
	    ind++;
	}
	if(!found)  cout<<"-1";
	return 0;
}
