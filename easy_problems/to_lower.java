import java.util.*;
public class to_lower {
    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
              char c = s.charAt(i);
            if(s.charAt(i) >='A' && s.charAt(i) <= 'Z' ){
               c = (char)(s.charAt(i) + ' ');
            }
            result.append(c);
        }
        return result.toString();
    }
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     String num = sc.next();
      System.out.println(toLowerCase(num));
     sc.close();
}
}
