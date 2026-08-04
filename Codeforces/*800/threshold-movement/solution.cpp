#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve() {
    int n;
    cin >> n;
    vector<int> w(n);
    for (int i = 0; i < n; i++) {
        cin >> w[i];
    }

    if (n % 2 != 0) {
        cout << "NO\n";
        return;
    }

    int max_even = 0;          
    int min_odd = 2e9;         

    for (int i = 0; i < n; i++) {
        if ((i + 1) % 2 == 0) {
            max_even = max(max_even, w[i]);
        } else {
            min_odd = min(min_odd, w[i]);
        }
    }

    if (max_even + 1 < min_odd) {
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