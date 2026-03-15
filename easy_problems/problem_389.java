import java.util.*;
class Solution {
    static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result =(char)(result ^ c);
        }
        for (char c : t.toCharArray()){
             result = (char)(result ^ c);
        }
        return result;
    }
}
public class problem_389{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char c  = Solution.findTheDifference(s , t);
        System.out.println(c);
        sc.close();
    }
}