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
    
   
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        for(int i=1 ;i<k; i++){
            fast = fast.next;
        }
        ListNode kth = fast;
        fast = fast.next;
        
        while(fast!=null){
            slow = slow.next;
            fast =fast.next;
        }
        
        int temp =slow.val;
        slow.val = kth.val;
        kth.val = temp;
        
        return head;
        
        
    }
}
