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
    
     public int listLength(ListNode head){
        ListNode temp = head;
        int len =0;
        
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        int listLen = listLength(head);
        ListNode temp = head;
        ListNode ptr = head;
        
        
        if(k==0){
            return head;
        }
        if(k%listLen==0 && k>listLen){
            return head;
        }
        
        
        int toReach = k>listLen ? listLen - k%listLen : listLen-k;
        
        if(toReach==0){
            return head;
            
        }
            
        ListNode prev=null;
        for(int i=0 ;i<toReach ;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        
        ListNode rotate = temp;
        
        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next=ptr;
        
        return rotate;
            
       }
}
