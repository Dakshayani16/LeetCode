class Solution {
    public boolean search(int target,int[] row,int n){
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        while(low<=high){
            mid=(low+high)/2;
         
            if(row[mid]==target){
                
                return true;
            }else if(target>row[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int cl=matrix[0].length;
        int i=0;
       
        while(i<row-1 && target>matrix[i][cl-1]){
            i++;
        }
       
       return search(target,matrix[i],cl);
    }
}