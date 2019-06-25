#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int main() {
	//code
	int test;
	cin>>test;
	cin>>ws;
while(test)
{
    	int freq[256];
	memset(freq,0,sizeof(freq));
    string str;
	getline(cin,str);
	cin>>ws;
	//cin.ignore();

	int index;
	for(index=0;str[index];index++)
	{
	    if(freq[str[index]]==0)
	    {
	        cout<<str[index];
	        freq[str[index]]++;
	    }
	}
  test--;
  cout<<endl;
}	
	return 0;
}
