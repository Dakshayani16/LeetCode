/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rev(ListNode head){
      if(head==null || head.next==null){
             return head;
        }
           
        ListNode newhead=rev(head.next);
        ListNode front=head.next;
         front.next=head;
        head.next=null;



       
       return newhead;
    }
    public ListNode getKthNode(ListNode head,int k){
        int i=1;
        ListNode temp=head;
        while(i<k && temp!=null){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevNode=null;
        ListNode nextNode=null;
        ListNode temp=head;
        ListNode kthNode=null;
        while(temp!=null){
            kthNode=getKthNode(temp,k);
            
            if(kthNode==null && prevNode!=null){
                prevNode.next=temp;
                break;
        }
        nextNode=kthNode.next;
        kthNode.next=null;
        rev(temp);
        if(temp==head){
head=kthNode;
        }else{
            prevNode.next=kthNode;
        }
        prevNode=temp;
        temp=nextNode;
        }
        return head;
    }
}