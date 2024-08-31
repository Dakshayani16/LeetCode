class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.get(nums[i])==null){
            map.put(nums[i],i);
        }
            int dif=target-nums[i];

          
            if(map.get(dif)!=null && map.get(dif)!=i){
                arr[0]=map.get(dif);
                arr[1]=i;
                return arr;
               
            }
        

       }
       return arr;
    }
}