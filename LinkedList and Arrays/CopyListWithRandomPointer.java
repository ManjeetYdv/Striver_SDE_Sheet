/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
         
       HashMap<Node , Node> map = new HashMap<>();
       Node temp = head;

        while(temp!=null){
            Node copy = new Node(temp.val);
            map.put(temp , copy);

            temp = temp.next;
        }

        

        Node resultNode = new Node(-1);
        Node temp2= head;
          while(temp2!=null) {

           map.get(temp2).next = map.get(temp2.next);
           map.get(temp2).random = map.get(temp2.random);

         
           temp2 = temp2.next;
       }

       resultNode.next =map.get(head);
       
   
      
       return resultNode.next;

        

        
    }
}
