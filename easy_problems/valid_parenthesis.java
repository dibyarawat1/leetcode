import java.util.*;
public class valid_parenthesis {
   static boolean isPalindrome(String s) {
        StringBuilder  result = new StringBuilder();
        for(int i = 0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            if(c >= 'A' && c<= 'Z'){
            c  = (char)(s.charAt(i) + ' ');
            }
            if((c >= 97 && c<= 122 ) || (c >= '0' && c <= '9')){
                 result.append(c);
            }
        }
      int left = 0 ; 
       int right = result.length()-1;
       boolean y = true;
     while(left < right){
        if(result.charAt(left)== result.charAt(right)){
            left++;
            right--;
        }
        else{
            y = false;
            break;
        }
     }
        return y;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
          System.out.println(isPalindrome(a));
         sc.close();
    }
} 
