import java.util.*;
public class longest_palindromic_substring {
    static boolean isPalindrome(String str , int left , int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        int start = 0;
        for(int i = 0 ; i< s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                int current = j+1-i;
                if(isPalindrome(s, i , j)){
                    if(max < current){
                        max = current;
                        start = i;
                    }
                }
            }
        }
        System.out.println(s.substring( start , max+start));
        sc.close();
    }
}
