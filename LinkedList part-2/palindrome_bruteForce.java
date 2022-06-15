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
    
    public static int getlen(ListNode head){
        ListNode temp=  head;
        
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        return count;
    }
    public boolean isPalindrome(ListNode head) {
        
        int[] arr = new int[getlen(head)];
        int k=0;
        ListNode temp= head;
        
        while(temp!=null){
            arr[k++] = temp.val;
            temp = temp.next;
        }
        
        for(int i=0 ;i<arr.length/2 ;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
