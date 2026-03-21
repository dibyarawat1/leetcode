import java.util.*;
public class sum_of_two_integer{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          while(num2!=0){
                int carry = num1 & num2;
                 num1 = num1 ^ num2;
                 num2 = carry << 1;
            }
            System.out.println(num1);
            sc.close();
    }
}