#include <iostream>
#include <string>

using namespace std;

int main() {
    int t;
    cin >> t;
    
    while (t--) {
        string s;
        cin >> s;
        
        string s_after_alice = "";
        bool zero_removed = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '0' && !zero_removed) {
                zero_removed = true; 
            } else {
                s_after_alice += s[i];
            }
        }
        
        string s_final = "";
        bool one_removed = false;
        
        for (int i = 0; i < s_after_alice.length(); i++) {
            if (s_after_alice[i] == '1' && !one_removed) {
                one_removed = true;
            } else {
                s_final += s_after_alice[i];
            }
        }
        
        cout << s_final << endl;
    }
    
    return 0;
}