#include<iostream>
#include<string>
using namespace std;

class solution {
public:
    int minOperations(string s) {
        int n = (int)s.size();
        if (n == 1) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (s[i] == s[i-1]) {
                if (s[i] == '0') {
                    s[i] = '1';
                    count++;
                } else {
                    s[i] = '0';
                    count++;
                }
            }
        }
        
        if (count < (n- count)) {
            return count;
        }
        return n - count;
    }
};

int main() {
    string s;
    cin >> s;
    solution myobj;
    cout << myobj.minOperations(s) << endl;
    return 0;
}