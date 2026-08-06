#include <bits/stdc++.h>
using namespaces std;

int main() {
    int n;
    cin >> n;
    
    while(n--) {
        int t;
        cin >> t;
        
        string s = to_string(t);
        int sz = s.size();
        
        int po = pow(10, sz - 1);
        
        cout << t - po << endl;
    }
    
    return 0;
}