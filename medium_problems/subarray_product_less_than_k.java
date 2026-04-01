import java .util.*;
public class subarray_product_less_than_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int right = n;
            int left = i;
            int product = 1;
            while(left < right){
                product = product * nums[left];
                if(product < k){
                    count++;
                }
                left++;
            }
        }
        System.out.println(count);
    }
}

