import java.util.*;
public class Minimum_operation_to_make_string_sorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ind = sc.nextInt();
        for(int i = 0  ;i< str.length(); i++){
            find(str,ind);
       count++;
        }
    }
    static int  find(String str,int ind){
        char mini = str.charAt(ind);
        int count =0;
           for(int  i = ind+1; i< str.length(); i++){
          if(mini > str.charAt(i)){
            mini = str.charAt(i);
          }
           }
           return count;
    }
}
