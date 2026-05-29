import java.util.HashSet;
import java.util.Set;

public class Medium_1 {
    //  3941. Password Strength
    
 public int passwordStrength(String nums) {
      Set<Character> set = new HashSet<>();
      for(char ch : nums.toCharArray()){
        set.add(ch);
      }
      int sum = 0;
      for(char ch : set){
        if(ch >= 'a' && ch<= 'z'){
            sum += 1;
        }else if(ch >= 'A' && ch <= 'Z'){
            sum += 2;
        }else if(ch >= '0' && ch <= '9'){
            sum += 3;
        }else{
            sum += 5;
        }
      }
      return sum;
    }
}
