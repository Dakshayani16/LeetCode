class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int output=0;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<=k-1;i++){
            lsum+=arr[i];
         
        }   output=lsum;
       int window=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
            rsum=rsum+arr[window];
            window--;
             output=Math.max(lsum+rsum,output);
        }
       
        return output;
    }
}