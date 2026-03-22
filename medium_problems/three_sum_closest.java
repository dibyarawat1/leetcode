import java.util.*;
public class three_sum_closest{
    static class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i< nums.length ; i++){
            int left = i+1;
            int right = nums.length -1;
            int sum = 0 ;
            int result = 0;
            while(left < right){
               sum =   nums[i] + nums[right] + nums[left];
               result = sum - target;
               if(result<0){
                result = -(result);
               }
               if(result < ans){
                  resultSum = sum;
                  ans = result;
               }
                if(sum == target){
                    left++;
                    right--;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return resultSum;
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int target = sc.nextInt();
    for(int i = 0 ; i< n ; i++){
        nums[i] = sc.nextInt();
    }
    Solution obj  = new Solution();
    System.out.println(obj.threeSumClosest(nums , target));
}
}