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
   
    ListNode findMiddle(ListNode head) {
        // If the list is empty or has only one node
        // the middle is the head itself
        if (head == null || head.next == null) {
            return head;
        }

        // Initializing slow and fast pointers
        ListNode slow = head;
        ListNode fast = head.next;

        // Move the fast pointer twice
        // as fast as the slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // When the fast pointer reaches the end,
        // the slow pointer will be at the middle
        return slow;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // Append the remaining nodes of list1 or list2
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return head.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;

        // Recursively sort the left and right halves
        left = sortList(left);
        right = sortList(right);

        // Merge the sorted halves
        return mergeTwoLists(left, right);
    
    }
}