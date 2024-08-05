class Solution {
    public String kthDistinct(String[] arr, int k) {
       
        // int cnt=0;
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
           if(map.get(arr[i])==null){
            map.put(arr[i],1);
           }else{
            map.put(arr[i],map.get(arr[i])+1);
           }
        }
        int cnt=0;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()==1 && cnt==k-1){
                System.out.print("dfg");
                return e.getKey();
            }else{
                if(e.getValue()==1){
                    cnt++;
                }
            }
        }
        return "";
      
    }
}