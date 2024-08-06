class Solution {
    public int reverse(int x) {
  
        int max=Integer.MAX_VALUE;
       
         
        int x1 = Math.abs(x);
        int flag=1;
   
        if(x==x1){
             flag=0;
        }
        int rev=0;
        while(x1>0){
            int lastdigit=x1%10;
          
            if (rev > (max - lastdigit) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }  x1=x1/10;
            rev=(rev*10)+lastdigit;
        }
        if(flag==1){
            return rev*(-1);
        }
        return rev;
    }
}