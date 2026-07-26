package weekly_contest_512;

import java.util.*;
 public class Easy_A{
       public int largestInteger(int n , int s){
        // where n is the number of the digits and s is the sum of the digits.
        if( s > 9*n){
            return -1; 
        }
        int ans=  0;
        while( s!= 0){
          ans = ans*(Math.min(9,s));
          s = s- (Math.min(9,s));
          n--;
        }
        ans = ans*(int)(Math.pow(10,n));
        return ans;
       } 
}