package weekly_contest_504;

public class Easy {
    public int digitFrequencyScore(int n) {
       int[] nums = new int[10];
        int sum = 0;
        while(n > 0){
            int ans = n%10;
            nums[ans]++;
            n = n/10;
        }
        for(int i = 0 ; i< 10 ; i++){
            sum = sum+(i*nums[i]);
        }
        return sum;
    }
}
