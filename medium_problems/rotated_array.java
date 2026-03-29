import java.util.*;
public class rotated_array {
   static class Solution {
    public void rotate(int[] nums, int k) {
       int[] ans = new int[nums.length];
       int i = 0;
       int n = nums.length;
       int c = k%n;
       int j = n-k;
       while(c>0){
        ans[i] = nums[j];
        i++;
        j++;
        c--;
       }
       for(int l = 0 ; l < (n-k); l++){
        ans[i] = nums[l];
        i++;
       }
       for(int m = 0 ; m < ans.length ; m++){
        nums[m] = ans[m];
       }
       for(int e = 0 ; e < nums.length ; e++){
       System.out.println(nums[i]);
    }
}
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int k = sc.nextInt();
    for(int i = 0 ; i< n ; i++){
        nums[i] = sc.nextInt();
    }
    Solution myobj = new Solution();
    myobj.rotate(nums ,  k);
   sc.close();
}
}
