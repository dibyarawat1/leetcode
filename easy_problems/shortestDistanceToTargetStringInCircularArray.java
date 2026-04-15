public class shortestDistanceToTargetStringInCircularArray {
    public int closestTarget(String[] words, String target, int startIndex) {
        int result  = Integer.MAX_VALUE;
        for(int i = 0 ; i< words.length ; i++){
            if(words[i].equals( target)){
              int  d =  Math.abs(i - startIndex);
               int minDis = words.length - d;
                result = Math.min(result , Math.min(d , minDis));
            }
        }
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}
