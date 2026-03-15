import java.util.*;
import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
      Arrays.sort(nums);
      int  y = nums[nums.length - 1];
      for(int i = 0 ; i < nums.length-1; i = i+3){
        if(nums[i] != nums[i+1]){
            y = nums[i];
            break;
        }
      }
      return y;
    }
}

public class single_number_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
       int[]  nums = new int[n];
         for(int  i = 0 ;  i < n ; i++){
           nums[i] =  sc.nextInt();
         }
         Solution myobj = new Solution();
         int y = myobj.singleNumber(nums);
         System.out.println(y);
         sc.close();
    }
}
