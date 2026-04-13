public class mindistance_to_theTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int  y = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< n ; i++){
            if(nums[i]== target){
               y = i - start;
               if(y < 0){
                 y  = -y;
               }
               if( min > y){
                min = y;
               }
            }
        }
        return min;
    }
}
