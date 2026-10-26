import java.util.*;
public class Question_1 {
  public static void main(String[] args){
    int[] nums = {1,5,2,4,1,3,0};
    System.out.println(peakValleyDifference(nums));
  }
    static int peakValleyDifference(int[] nums) {
      int psum = 0;
        int vsum = 0;
        for(int i = 1  ; i< nums.length-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                psum += nums[i];
            }else if(nums[i] < nums[i-1] && nums[i] < nums[i+1]){
                vsum += nums[i];
            }
        }
        return psum - vsum;
    }

}
