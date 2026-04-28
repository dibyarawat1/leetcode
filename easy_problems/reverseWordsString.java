class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("[\\s]+");
        StringBuilder str = new StringBuilder();
        for(int i = 0 ;  i < arr.length ; i++){
            int right = arr[i].length() - 1;
            while(right >= 0){
                str.append(arr[i].charAt(right));
                right--;
            }
            if(i < arr.length -1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}