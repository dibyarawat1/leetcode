import java.util.*;
public class remove_dupliacte_from_sorted_array {
       public  static int removeDuplicates(int[] nums) {
           if(nums == null || nums.length == 0){
               return 0;
            }
            int uniqueNum = 1;
       for(int i = 1; i < nums.length ; i++){
        if(nums[i] != nums[i-1]){
            nums[uniqueNum] = nums[i];
            uniqueNum++;
        }
       }
       return uniqueNum;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(num));
        sc.close();
    }
}
