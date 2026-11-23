package Biweekly_contest_196;

public class MinimumRangeAfterSumOperations {
    public int minRange(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] ans = {a,b,c};
        int sum = 0;
        for(int i = 0 ; i< 3; i++){
            max = Math.max(ans[i], max);
            min = Math.min(ans[i],min);
            sum += ans[i];
        }
        int range = max-min;
       while(max > (sum-max)){
           max = sum-max;
           range = Math.min(range,(max-min));
           sum = max+(sum-max);
       }
        return range;
    }
}
