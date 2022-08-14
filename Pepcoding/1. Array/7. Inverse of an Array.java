 public static int[] inverse(int[] a){
      int []inv=new int[a.length];
      for(int i=0;i<a.length;i++){
        inv[a[i]]=i;  
      } 
      return inv;
  }