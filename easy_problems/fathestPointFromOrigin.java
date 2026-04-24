class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count =0 ;
        for(int i = 0 ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'L'){
                count--;
            }else if(moves.charAt(i)== 'R'){
                count++;
            }
        }
        if(count > 0){
            for(int i = 0 ; i< moves.length() ; i++){
                if(moves.charAt(i) == '_'){
                    count++;
                }
            }
        }else{
            for(int i = 0; i < moves.length() ; i++){
                count = Math.abs(count);
                if(moves.charAt(i) == '_'){
                     count++;
                }
            }
        }
        return count;
    }
}