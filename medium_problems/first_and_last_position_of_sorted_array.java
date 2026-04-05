import java.util.*;
public class first_and_last_position_of_sorted_array {
    static int[] searchRange(int[] nums, int target) {
      if(nums == null || nums.length == 0){
        return new int[]{-1 , -1};
      }
      int left = 0 ;
      int right  = nums.length-1;
      while(left < right ){
        if(nums[left] != target){
            left++;
        }
        if(target != nums[right]){
            right--;
        }
        if(left == right){
            return new int[]{-1 ,-1};
        }
      }
      return new int[]{left , right};
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int target = sc.nextInt();
    for(int i = 0 ; i < n ; i++){
        nums[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(searchRange(nums , target)));
    sc.close();
}
}
