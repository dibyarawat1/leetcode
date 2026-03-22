import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        long sum = 0;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
           sum = (long)nums[i]+nums[j]+ nums[left] + nums[right];
                    if(sum == target){
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[left]);
                        result.add(nums[right]);
                        right--;
                        left++;
                        ans.add(result);
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(ans);
    }
}
public class four_sum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i< n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.fourSum(nums , target));
        sc.close();
     }
}