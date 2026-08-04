#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t; 
    cin >> t;
    
    while(t-- > 0){
        long long a, b, n;
        cin >> a >> b >> n;
        
        vector<long long> arr(n);
        long long sum = 0;
        
        for(int i = 0; i < n; i++){
            cin >> arr[i];
            sum += min(a - 1, arr[i]);
        }
        cout << (sum + b) << "\n";
    }
    return 0;
}