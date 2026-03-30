import java.util.*;
public class three_sum {
   static class Solution{
    public List<List<Integer>> threeSum(int[] nums) {
     Set<List<Integer>> ans  = new HashSet<>();
       if(nums.length < 3){
        return new ArrayList<>();
       }
       Arrays.sort(nums);
       for(int i = 0 ;i< nums.length; i++){
        int left = i+1;
        int right = nums.length-1;
        while(left < right){
        if((nums[left] + nums[right] +nums[i]) == 0){
            List<Integer> result = new ArrayList<>();
            result.add(nums[i]);
            result.add(nums[left]);
            result.add(nums[right]);
            left++;
            right--;
                ans.add(result);
        }else if((nums[i] + nums[right] + nums[left])< 0){
            left++;
        }else{
            right--;
        }
       }
       }
       return new ArrayList<List<Integer>>(ans);
    }
}
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    for(int i = 0 ;i<n ; i++){
        num[i]  = sc.nextInt();
    }
    Solution myobj = new Solution();
    System.out.println(myobj.threeSum(num));
    sc.close();
}
}
