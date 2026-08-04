#include <iostream>
using namespace std;

void solve() {
    int n;
    cin >> n;
    int w1, w2;
    
    cin >> w1;
    if (n >= 2) {
        cin >> w2;
    }
    
    for (int i = 3; i <= n; i++) {
        int temp;
        cin >> temp;
    }
    
    if (w1 > w2) {
        cout << "YES\n";
    } else {
        cout << "NO\n";
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}