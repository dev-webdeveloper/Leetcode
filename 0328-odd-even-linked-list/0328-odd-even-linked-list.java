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
    public ListNode oddEvenList(ListNode head) {
        
        if (head == null || head.next == null) {
            
            return head;
            
        }

        // Initialize pointers for odd and even lists
        ListNode odd = head;
        
        ListNode even = head.next;
        
        ListNode evenHead = even;  // Save the head of the even list

        while (even != null && even.next != null) {
            
            // Move odd pointer
            odd.next = even.next;
            
            odd = odd.next;

            // Move even pointer
            even.next = odd.next;
            
            even = even.next;
            
        }

        // Connect the odd and even lists
        odd.next = evenHead;

        return head;
    }
}