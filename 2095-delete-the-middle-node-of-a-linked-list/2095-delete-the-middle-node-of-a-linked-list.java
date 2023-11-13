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
    public ListNode deleteMiddle(ListNode head) {
        
         // Check if the list is empty or has only one element
        if (head == null || head.next == null) {
            
            return null;
            
        }

        ListNode slow = head;
        
        ListNode fast = head;
        
        ListNode prev = null;

        // Move 'fast' two steps and 'slow' one step until 'fast' reaches the end
        while (fast != null && fast.next != null) {
            
            prev = slow;
            
            slow = slow.next;
            
            fast = fast.next.next;
            
        }

        // Delete the middle node (node pointed by 'slow')
        if (prev != null) {
            
            // Update the next pointer of the previous node
            prev.next = slow.next;
            
        } else {
            
            // If there is no previous node, update the head
            head = head.next;
            
        }

        return head;
    }
}