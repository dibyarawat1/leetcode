public class Smallest_Divisible_Digit_Product_1{
     static int sumDigit(int n){
        int prod = 1;
        while(n != 0){
            int ans = n%10;
            n = n/10;
           prod = prod*ans;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        
      
       while(sumDigit(n) <= n){
        if(sumDigit(n)% t == 0){
            return n;
        }
        n++;
       }
    return n;
    }
}