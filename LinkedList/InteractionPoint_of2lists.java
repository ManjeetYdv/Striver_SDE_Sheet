/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        
        if(ptr1==null ||ptr2==null ){
            return null;
        }
        
        int l1=0;
        int l2=0;
        
        while(ptr1!=null){
            ptr1 =ptr1.next;
            l1+=1;
            
        }
        while(ptr2!=null){
            ptr2 =ptr2.next;
            l2+=1;
            
        }
        int diff = Math.abs(l1-l2);
        ListNode dummy = new ListNode();
        
        if(l2>l1){
            dummy =headB;
        }
        else{
            dummy=headA;
        }
        
        for(int i=0 ;i<diff ;i++){
            dummy = dummy.next;
            
        }
        
        if(l2>l1){
            ptr2=dummy;
            ptr1=headA;
        }
        else{
            ptr1=dummy;
            ptr2=headB;

        }
        
        while(ptr1!=null && ptr2!=null){
            
            if(ptr1==ptr2){
                return ptr1;
            }
            else{
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
        }
        
        return null;
        
        
    }
}
