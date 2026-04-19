import java.util.*;
public class maximumDistanceBetweenPairOfValues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        for(int i =0 ; i < n ; i++){
            nums1[i] = sc.nextInt();
        }
        for(int j = 0; j< m ; j++){
            nums2[j] = sc.nextInt();
        }
    int i = 0 ; 
     int  j = 0  ; 
     int result = 0;
     while( i< nums1.length && j < nums2.length){
        if(nums1[i] <= nums2[j]){
            result = Math.max(result  , j-i);
            j++;
        }else{
            i++;
        }
     }
     System.out.println(result);
     sc.close();
}
}
