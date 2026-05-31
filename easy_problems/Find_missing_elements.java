import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_missing_elements {
     public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
      Set<Integer > set = new HashSet<>();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i : nums){
        min = Math.min(min , i);
        max = Math.max(max , i);
    }
    for(int i : nums){
        set.add(i);
    }
    while( min <= max){
        if(!(set.contains(min))){
            list.add(min);
        }
        min++;
    }
    return list;
    }
}
