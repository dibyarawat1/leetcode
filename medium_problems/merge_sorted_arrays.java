class merge_sorted_arrays{
    public void merge(int[] n1, int m, int[] n2, int n) {
       int left = m+n -1 ; 
       int right = n-1;
       int i= m-1;
       while(i >= 0 && right >=0){
        if(n1[i] < n2[right] ){
            n1[left] = n2[right];
            left--;
            right--;
        }else {
            n1[left] = n1[i];
            left--;
            i--;
        }
       }
       while(right >= 0){
        n1[left] = n2[right];
        right--;
        left--;
       }
        }
    }