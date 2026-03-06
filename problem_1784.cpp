#include<iostream>
#include<string>
using namespace std;
class solution{
    public:
    bool checkOnesSegment(string s){
          char prev = '1';
          for(char current : s){
            if(prev == '0' && current == '1'){
                return false;
            }
            prev  =  current ;
          }
          return true;
    }
};

/*this is another class matlab dono tareeke sahi hain bus readability ka fark hai */

class otherSolution {
public:
    bool checkOnesSegment(string s) {
        int  n  =  (int)s.size();
        bool yes = false;
        int i;
      if(n<2){
        return true;
      }
        for( i = 0 ; i<n-1 ; i++){
            if(s[i]=='1' && s[i+1]=='1'){
                yes =  true;
            }
            else{
                break;
            }
        }
        if(s[0]=='1'){
            yes = true;
        }
         for(int k = i+1 ; k<n; k++){
              if(s[k]!='0'){
                yes = false;
         }
         }
    return yes;
    }
};
int main(){
    string s;
    cin>>s;
    solution myobj;
    cout<<myobj.checkOnesSegment(s)<<endl;
}
