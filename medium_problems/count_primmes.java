import java.util.*;
public class count_primmes {
   static class  Solution {
    public int countPrimes(int n) {
         if(n< 2){
        return 0;
      }
      boolean[] isPrime = new boolean[n]; 
      for(int i = 2 ; i < n ; i++){
        isPrime[i] = true;
      }
      for(int i = 2 ; i*i <n ; i++){
        if(isPrime[i] == true){
            for(int j = i*i ; j<n ; j+=i){
                isPrime[j] = false;
            }
        }
      }
      int count = 0;
      for(int i = 2 ;i<n ; i++){
        if(isPrime[i] == true){
            count++;
        }
      }
      return count;
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     int n  = sc.nextInt();
     Solution myobj = new Solution();
     System.out.println(myobj.countPrimes(n));
     sc.close();
}
}
