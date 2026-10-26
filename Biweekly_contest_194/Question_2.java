package Biweekly_contest_194;

public class Question_2 {
    public static void main(String[] args){

    }
   static long countSubarrays(int[] nums, int minK, int maxK) {
     int start = 0;
     long count = 0;
       for(int i = 0 ; i< nums.length; i++){
        while( start <= i && (nums[i] < minK || nums[i] > maxK)){
               start++;
           }
           count += i-start+1;
       }
         return count;
    
}
}

