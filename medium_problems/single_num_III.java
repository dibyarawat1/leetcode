import java.util.*;
public class single_num_III {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
       int[] y = new int[2];
       int k = 0;
        for(int i = 0  ; i < nums.length; i++){
             int count = 0 ;
             for(int j = 0 ; j< nums.length; j++){
                if(nums[i] == nums[j]){
                  count++;
                }
             }
             if(count == 1){
                y[k] = nums[i];
                k++;
             }
             if(k==2){
                break;
             }
        }
        return y;
    }
public static void main(String[] args){
    Scanner sc=  new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0 ; i < n ; i++){
        nums[i] = sc.nextInt();
    }
     single_num_III myobj = new  single_num_III();
    int[] y = new int[2];
      y = myobj.singleNumber(nums);
      for(int i = 0 ; i <2 ; i++){
        int j = y[i];
        System.out.print(j+" ");
      }
      System.out.println(Arrays.toString(y));
      sc.close();
}
}
