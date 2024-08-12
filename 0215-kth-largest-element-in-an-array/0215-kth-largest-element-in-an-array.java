class Solution {
    PriorityQueue<Integer> q=new PriorityQueue<>();
    public int findKthLargest(int[] nums, int k) {
     for(int el:nums){
        q.offer(el);
     }   
     while(q.size()>k){
        q.poll();
     }
     return q.peek();
    }
}