public class MostCommonWord{
      public String mostCommonWord(String paragraph, String[] banned){
        String s ="";
        int max = Integer.MIN_VALUE;
    int count = 0 ; 
    paragraph = paragraph.toLowerCase();
    String[] arr1 = paragraph.split("[\\s\\p{Punct}]+");
    for(int i = 0 ; i< arr1.length ; i++){
        if(arr1[i].isEmpty()){
            continue;
        }
        boolean isBanned = true;
        for(int k = 0 ; k < banned.length ; k++){
         if(arr1[i].equals(banned[k])){
            isBanned = false;
            break;
         }
        }
        if(isBanned){
            count = 0 ; 
            for(int j = 0 ; j< arr1.length ; j++){
                if(arr1[i].equals(arr1[j])){
                    count++;
                }
            }
            if(count > max){
                max = count;
                s = arr1[i];
            }
        }
    }
    return s;
    }
}