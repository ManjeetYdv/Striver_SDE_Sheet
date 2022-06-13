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
    
    public static int getSize(ListNode head){
        ListNode temp = head;
        int size =0;
        while(temp!=null){
            temp =temp.next;
            size++;
        }
        
        return size;
    }
    
    public static ListNode prevNode(ListNode head , int n){
        
        ListNode temp = head;
        
        for(int i=1 ;i<n ;i++){
            temp = temp.next;
            
        }
        return temp;
    } 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int size = getSize(head);
   
        
        if(head==null){
            return null;
        }
        if(size==n){
            head = head.next;
            return head;
        }
        
        int prevPos = size - n;
        ListNode temp  = prevNode(head ,prevPos );
        
        if(n==1){
            temp.next=null;
            return head;
        }
        
        temp.next =temp.next.next;
        return head;
        
        
    }
}
