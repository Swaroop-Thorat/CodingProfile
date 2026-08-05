#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int cases;
	cin>>cases;
	while(cases-- >0){
	    int n;
	    cin>>n;
	    vector<int> arr(n);
	    for (int i=0;i<n;i++){
	        cin>>arr[i];
	    }
	    sort(arr.begin(), arr.end());
	    int c1=count(arr.begin(), arr.end(), arr[0]);
	    int c2=n-c1;
	    
	   vector<int> distinct = arr;
       distinct.erase(unique(distinct.begin(), distinct.end()), distinct.end());
	   
	   
	    if(distinct.size()==1){
	        cout<<"YES"<<endl;
	    }
	    else if(distinct.size()==2){
	        if(abs(c1-c2)<=1){
	          cout<<"YES"<<endl;
	        }
	        else{
	            cout<<"NO"<<endl;
	        }
	    }
	    else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;

}