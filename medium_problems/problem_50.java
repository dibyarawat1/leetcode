import java.util.Scanner;
class Solution {
    int sum = 0;
    int max = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
           if(max < sum){
            max =sum;
           }
           if(sum < 0){
            sum = 0;
           }
        }
        return max;
    }
}
public class problem_50 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
           int[] nums = new int[n];
           for(int i = 0 ;i< n ; i++){
            nums[i] = sc.nextInt();
           }
           Solution myobj = new Solution();
           System.out.println(myobj.maxSubArray(nums));
           sc.close();
        }
    }

