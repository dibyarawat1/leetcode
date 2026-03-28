import java.util.Arrays;
import java.util.*;
public class contains_duplicates {
   static class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        boolean y = false;
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }
            if(count == 1){
                y = true;
                
            }
        }
        return  y;
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new  int[n];
    for(int i = 0 ; i< n ; i++){
        nums[i] = sc.nextInt();
    }
    Solution myobj = new Solution();
     System.out.println( myobj.containsDuplicate(nums));
     sc.close();
}
}
