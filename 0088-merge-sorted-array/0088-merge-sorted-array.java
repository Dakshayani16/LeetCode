import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      int ans[]=new int[n+m];
      int i=0,j=0;
      int k=0;
      while(i<m && j<n){
        if( nums1[i]<nums2[j]){
            ans[k]=nums1[i];
            i++;
            k++;
        }else{
            ans[k]=nums2[j];
            j++;
            k++;
        }
        
      }
       while(i<m){
        ans[k]=nums1[i];
        k++;
        i++;
      }
      while(j<n){
        ans[k]=nums2[j];
        k++;
        j++;
      }
    for(int l=0;l<ans.length;l++){
        nums1[l]=ans[l];
    }
    
    
      
    }
}