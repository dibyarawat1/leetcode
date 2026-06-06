//  Exactly One Consecutive Set Bits 

public class easy {
 public boolean consecutiveSetBits(int n) {
        int[] nums = new int[32];
        int i = 0;
        int count = 0;
        while(n != 0){
            nums[i] = n&1;
            i++;
            count++;
         n = n>>1;   
        }
        int yes = 0;
        for(int j = 0 ; j< count-1 ; j++){
            if(nums[j] == nums[j+1] && nums[j] == 1){
                yes++;
            }
        }
        if(yes == 1){
            return true;
        }
        return false;
    }
}
