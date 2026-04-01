import java.util.Scanner;
public class maximum_product_subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            int right = n;
            int left = i;
            int product = 1;
            while(left < right){
                product = product * nums[left];
                if(product > maxProduct){
                   maxProduct = product;
                }
                left++;
            }
        }
        System.out.println(maxProduct);
        sc.close();
}
}