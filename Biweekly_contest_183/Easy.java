import java.util.*;

public class Easy{
    static int minimumSwaps(int[] arr){
        int  i = 0;
        int  j = arr.length -1;
        int count = 0;
        while(i < j){
            if(arr[i] == 0 && arr[j] !=0){
                count++;
                i++;
                j--;
            }else if(arr[i]== 0 && arr[j] == 0){
                j--;
            }else{
                i++;
            }
        }
        return count;
    }
    }
//   3936. Minimum Swaps to Move Zeros to End
