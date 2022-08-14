 public static void reverse(int[] a){
    // write your code here
    int i=0;
    int j=a.length-1;
    
    while(i<=j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j--;
    }
    
  }