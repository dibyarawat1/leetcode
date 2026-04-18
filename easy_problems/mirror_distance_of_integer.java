public class mirror_distance_of_integer {
    
    public int mirrorDistance(int n) {
        int rev = 0;
        int a = n;
        while(n >0){
            int ans  = n %10;
            rev =  rev*10 + ans;
            n = n/10;
        }
        return Math.abs(a - rev);
    }
}

