class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        long quo = 0;
        boolean isNeg = (dividend < 0) ^ (divisor < 0);
        long divid = Math.abs((long)dividend);
        long divis = Math.abs((long) divisor);
        while(divid >= divis){
            long temp = divis;
            long mul = 1;
            while(divid >= (temp << 1)){
                temp <<= 1;
                mul <<=1;
            }
            divid -= temp;
            quo -= mul;
        }
        return isNeg ? -quo : quo;
    }
}