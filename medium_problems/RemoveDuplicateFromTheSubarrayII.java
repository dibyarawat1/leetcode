public class RemoveDuplicateFromTheSubarrayII {
    public static int removeDuplicates(int[] nums){
        int   k = 2;
        int idx = 2;
        while(idx < nums.length){
            if(nums[idx] != nums[k-2]){
                nums[k] = nums[idx];
                k++;
                idx++;
            }
            else{
                 idx++;
            }
        }
        return k;
    }
}
