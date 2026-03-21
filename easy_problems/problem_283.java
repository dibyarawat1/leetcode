import java.util.*;
public class problem_283 {
   static class Solution {
    public static void moveZeroes(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++){
            for(int j = 0; j<nums.length-1 ;j++){
                if(nums[j] == 0){
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
        }
        for(int i = 0 ;i < nums.length ; i++){
        System.out.print(nums[i]);
    }
}
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0 ; i< n ; i++){
        nums[i] = sc.nextInt();
    }
   Solution. moveZeroes(nums);
    sc.close();
}
}
