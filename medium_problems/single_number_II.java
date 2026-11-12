public class single_number_II {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
       int[]  nums = new int[n];
         for(int  i = 0 ;  i < n ; i++){
           nums[i] =  sc.nextInt();
         }
       System.out.println(singleNumber(nums));
         sc.close();
    }
static int singleNumber(int[] nums) {
      Arrays.sort(nums);
      int  y = nums[nums.length - 1];
      for(int i = 0 ; i < nums.length-1; i = i+3){
        if(nums[i] != nums[i+1]){
            y = nums[i];
            break;
        }
      }
      return y;
    }
  }

