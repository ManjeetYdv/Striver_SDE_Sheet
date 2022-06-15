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
    
    public static ListNode reverseList(ListNode head){
       
        ListNode curr = head;
        ListNode prev= null;
        ListNode next = head;
        
        while(curr!=null){
            
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next!=null && fast.next.next!=null){             //Finding median
            fast = fast.next.next;
            slow = slow.next;
            
        }
      
        slow.next = reverseList(slow.next);
        
        slow = slow.next;
        ListNode dummy = head;
        
        while(slow!=null){
            
            if(dummy.val!=slow.val){
                return false;
            }
            dummy = dummy.next;
            slow = slow.next;
        }
        
        return true;
        
    }
}
