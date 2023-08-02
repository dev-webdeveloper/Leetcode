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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
            //The first condition checks if both list1 and list2 are null.
            //In this case, both linked lists are empty, so the function returns nothing and exits.
            if(list1==null && list2==null){

                return list1;

                //The second condition checks if list1 is null and list2 is not null.
                //Here, list2 is not empty, so the function returns list2 and exits.
                } else if (list1==null && list2!=null) {

                    return list2;

                //The third condition checks if list1 is not null and list2 is null.
                //In this case, list1 is not empty, so the function returns list1 and exits.
                  } else if (list1!=null && list2==null) {

                    return list1;

            } else {
                
                //This condition checks if the value of the current node in list1 is less than the value of the current node in list2.
                //If this condition is true, it means that the smallest value is in list1, so we should merge the rest of list1 with list2.
                if(list1.val < list2.val){
                    
                    //This line sets the next pointer of the current node in list1 to the result of merging the remaining nodes of list1 with list2. This is a recursive call that handles the next nodes of list1.
                    list1.next = mergeTwoLists(list1.next, list2);
                    
                    // After merging the remaining nodes of list1 with list2, the function returns list1.
                    return list1;
                    
                    // (when list1.val >= list2.val)
                    } else{
                    
                        //This line sets the next pointer of the current node in list2 to the result of merging list1 with the remaining nodes of list2. Again, this is a recursive call that handles the next nodes of list2.
                        list2.next = mergeTwoLists(list1, list2.next);
                    
                        //After merging list1 with the remaining nodes of list2, the function returns list2.
                        return list2;
                    
                    }
            
            }
                  
    
    }
        
    
}