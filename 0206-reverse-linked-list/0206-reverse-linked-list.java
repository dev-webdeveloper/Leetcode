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
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        
        ListNode current = head;
        
        ListNode next = null;

        while (current != null) {
            
            next = current.next; // Save the next node
            
            current.next = prev; // Reverse the link

            // Move pointers one position ahead
            prev = current;
            
            current = next;
            
        }
        
        // At the end of the loop, 'prev' will be the new head of the reversed list
        return prev;
    }
}