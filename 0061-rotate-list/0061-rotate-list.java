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
    // public ListNode rev(ListNode head){
    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     ListNode newHead=rev(head.next);
    //     ListNode front=head.next;
    //     front.next=head;
    //     head.next=null;
    // }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp2=head;
        int n=0;
        ListNode temp=head;
        ListNode prev=head;
        if(head==null || head.next==null){
            return head;
        }
         while(temp!=null){
            prev=temp;
            temp=temp.next;

            n++;
        }
        k=k%n;
        int d=n-k;
        int i=0;
        prev.next=head;
        temp=head;
        while(i<d){
            temp2=temp;
temp=temp.next;
            i++;
        }
        temp2.next=null;
        return temp;
        
    }
}