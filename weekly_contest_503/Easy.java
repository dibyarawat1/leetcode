public class Easy{
//    3940. Limit Occurrences in Sorted Array
   /* 
    this question basically said to write the occurence of the elements  at least k times 
   */
   public int[] limitOccurrences(int[] nums, int k) {
    int index= 0;
    for(int num : nums){
        if(index < k || num != nums[index - k]){
            nums[index] = num;
            index++;
        }
    }
    return Arrays.copyOf(nums , index);
   }
}