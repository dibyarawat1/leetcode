package Biweekly_contest_196;

public class AssignUmbrellaonRainyDays {
    
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] ans = new String[n];
        int ca = 0 , cb = 0;
        for(int i = 0 ; i< rain.length-1; i++){
            if(rain[i] == 1 && rain[i+1] == 1){
                if(ca < cb || ca == cb){
                    ans[i] = "Alice";
                    ca++;
                }else{
                    ans[i] = "Bob";
                    cb++;
                }
            }else if(rain[i] == 1){
                ans[i] = "Bob";
                cb++;
            }else{
                ans[i] = "None";
            }
        }
        if(rain[n-1] == 1){
            ans[n-1] = "Bob";
        }else{
            ans[n-1] = "None";
        }
        return ans;
    }
}
