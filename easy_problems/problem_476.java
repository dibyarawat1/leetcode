import java.util.Scanner;
public class problem_476{
    static int findFlip(int num ){
        int mask = 0;
        int n =  num;
        if(num == 0){
            return 1;
        }
        while(num !=0 ){
             mask  =  (mask << 1) | 1;
            num   = num >>> 1 ;
        }
        int ans = (~n) & mask;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = findFlip(num);
        System.out.println(c);
        sc.close();
    }
}