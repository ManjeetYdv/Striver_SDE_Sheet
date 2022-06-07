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
    public static int getElementCount(ListNode head){
        ListNode temp= head;
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev=null;
        ListNode next =head;
        
        int count=0;
        while(curr!=null && count<k ){
            next = curr.next;
            curr.next = prev;
            
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null && getElementCount(next)>=k ){
            head.next = reverseKGroup(next , k);
        }
        else if(next!=null && getElementCount(next)<k){
            head.next = next;
        }
        
        return prev;
        
    }
}
