import java.util.*;
public class container_with_most_water {
    public static int maxArea(int[] height) {
       int left = 0 ;
       int ans = 0;
       int right = height.length -1;
    while(left < right){
        int w = right-left;
        int  h = Math.min(height[left] , height[right]);
            int area = h*w;
            ans = Math.max(ans , area);
          if  (height[left] < height[right]){
            left++ ;
          }
            else{
             right--;
            }
    }
    return ans;
    }
public static void main(String[] args){
   Scanner sc = new Scanner (System.in);
   int n =  sc.nextInt();
   int[] height = new int[n];
   for(int  i = 0  ; i< n ; i++){
    height[i]  = sc.nextInt();
   }
   System.out.println(maxArea(height));
   sc.close();
}
}
