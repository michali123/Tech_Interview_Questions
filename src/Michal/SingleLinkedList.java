package Michal;


import java.util.LinkedList;

public class SingleLinkedList {
    Node head;

    SingleLinkedList(int value){
        this.head = new Node(value);
    }

    public void append (int data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }

    public void prepend (int data){
        if (head == null){
            head = new Node(data);
            return;
        }

        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        return;
    }

    public void delete (int data){
        if (head == null)
            return;
        if (head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null){
            if (current.next.data == data)
                current.next = current.next.next;
            return;
        }
    }

    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            if (current.next == null) return;
            current = current.next;
        }
        return;

    }

    public int listSize (){
        int count = 0;
        Node current = head;
        if (head != null){
          while (current != null){
              count++;
              if(current.next==null) return count;
              current = current.next;
          }

        }
            return count;

    }



}
