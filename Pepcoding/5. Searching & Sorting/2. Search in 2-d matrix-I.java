public static boolean search(int[][]matrix,int target) {
        int r=binarySearchRowSelect(matrix,target);
        if(r==-1){
            return false;
        }
        boolean isFound=binarySearch(matrix,r,target);
        return isFound;
    }
    public static boolean binarySearch(int[][] matrix,int r,int target){
        int lo=0;
        int hi=matrix[0].length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(matrix[r][mid]==target){
                return true;
            }else if(matrix[r][mid]>target){
                 hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return false;
    }
    
    public static int binarySearchRowSelect(int [][] matrix,int target){
        int lo=0;
        int hi=matrix.length-1;
        int lc=matrix[0].length-1;   //last column
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][lc]){
                return mid;
            }else if(target>matrix[mid][0]){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    } 