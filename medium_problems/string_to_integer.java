import java.util.*;

class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int i = 0;
        int sign = 1;
        while(i< s.length() && s.charAt(i)== ' '){
            i++;
        }
        if(i>= s.length()){
            return 0;
        }
        if(s.charAt(i)== '-' || s.charAt(i)== '+'){
            sign = (s.charAt(i)== '-') ? -1: 1;
            i++;
        }
      while(i < s.length()){
            if(((s.charAt(i))-'0')>= 0 && ((s.charAt(i))-'0')<=9){
     if(num > (Integer.MAX_VALUE)/10 || (num == (Integer.MAX_VALUE/10)) &&   (s.charAt(i)-'0')>7){
                return (sign==1)?Integer.MAX_VALUE: Integer.MIN_VALUE;
                }
                num  = num*10 + (s.charAt(i)-'0');
                i++;
            }else{
                break;
            }
        }
         return num*sign;
    }
}
public class string_to_integer{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String s = sc.nextLine();
    Solution  myobj = new Solution();
    System.out.println(myobj.myAtoi(s));
    sc.close();
}
}