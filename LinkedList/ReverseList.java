package com.company;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
         this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void InsertAtFirst(int value){                      //Insert At First
        Node node = new Node(value);
        node.next=head;
        head= node;

        if(tail==null){                //when first element is inserted.
            tail=head;
        }
        size++;

    }

    public void InsertAtLast(int value){            //Insert At Last
        Node node = new Node(value);                //advantage of maintaining tail is here this takes 0(1) time
        if(tail==null){
            InsertAtFirst(value);
            return;
        }
        tail.next= node;
        tail = node;
        size++;

    }
    

 

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value+" -> " );
            temp =temp.next;
        }
        System.out.println("END");

    }

    
   
    public  void  reverseList(){

        Node prev =null;
        Node curr = head;
        Node next = curr;
        while(curr!=null){
            next = curr.next;
            curr.next =prev;

            prev=curr;
            curr=next;

        }
        head = prev;

    }

    public static void main(String[] args) {
       
        LL list1 = new LL();
        list1.InsertAtLast(1);
        list1.InsertAtLast(2);
        list1.InsertAtLast(5);
        list1.InsertAtLast(7);

        list1.reverseList();
        list1.display();
    }

}
