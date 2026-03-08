#include<iostream>
#include<string>
#include<vector>
using namespace std;
class Solution {
public:
    string findDifferentBinaryString(vector<string>& nums) {
        int  n = nums.size();
        string s = "";
        s.reserve(n);
        for(int  i  = 0 ; i<n ; i++){
            s = s + (nums[i][i] == '0'? '1' : '0');
           }
        return s;
    }
};
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin>>n;
     vector<string> nums(n);
    for(int  i = 0 ; i < n ; i++){
        cin>>nums[i];
    }
    Solution myobj;
    cout<<myobj.findDifferentBinaryString(nums)<<"\n";
}