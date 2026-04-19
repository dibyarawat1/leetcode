public class twoFarthestHouseWithDifferentColors {
    public int maxDistance(int[] colors) {
       int  j = colors.length -1;
       int  i = 0;
       int  k = j;
       int result = 0;
       while(j >0){
        if(colors[i] != colors[j]){
            result = j-i;
           break;
        }
        j--;
       }
       while(i < colors.length){
        if(colors[i] != colors[k]){
            result =  Math.max(result , k-i);
            break;
        }
        i++;
       }
       return result;
    }
}

