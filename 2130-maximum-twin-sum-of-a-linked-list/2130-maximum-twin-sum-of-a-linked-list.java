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
    public int pairSum(ListNode head) {
        
        // Initialize pointers for slow and fast traversal
        ListNode slow = head;
        
        ListNode fast = head;
        
        int maxVal = 0;

        // Move fast pointer at twice the speed of slow pointer
        while (fast != null && fast.next != null) {
            
            slow = slow.next;
            
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode nextNode, prev = null;
        
        while (slow != null) {
            
            nextNode = slow.next;
            
            slow.next = prev;
            
            prev = slow;
            
            slow = nextNode;
        }

        // Compare and find the maximum twin sum
        while (prev != null) {
            
            maxVal = Math.max(maxVal, head.val + prev.val);
            
            prev = prev.next;
            
            head = head.next;
        }

        return maxVal;
        
    }
    
}