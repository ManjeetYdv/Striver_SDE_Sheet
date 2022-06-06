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

    
    public static LL merge(LL list1 , LL list2){
        Node p1 = list1.head;
        Node p2 = list2.head;

        LL merged = new LL();
        while(p1!=null && p2!=null){

            if(p1.value<p2.value){
                merged.InsertAtLast(p1.value);
                p1 = p1.next;
            }
           else{
                merged.InsertAtLast(p2.value);
                p2 =p2.next;
            }
        }

        while(p1!=null){
         merged.InsertAtLast(p1.value);
         p1 = p1.next;

        }
        while(p2!=null){
            merged.InsertAtLast(p2.value);
            p2 = p2.next;
        }

        return merged;
    }


    public static void main(String[] args) {
        
        LL list1 = new LL();
        list1.InsertAtLast(1);
        list1.InsertAtLast(2);
        list1.InsertAtLast(5);
        list1.InsertAtLast(7);

        LL list2 = new LL();
        list2.InsertAtLast(3);
        list2.InsertAtLast(4);
        list2.InsertAtLast(9);

       LL merged = new LL();
       merged = LL.merge(list1 , list2);
       merged.display();

    }

}
