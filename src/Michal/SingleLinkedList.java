package Michal;


public class SingleLinkedList {
    Node head;

    public void append (int data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.link != null){
            current = current.link;
        }
        current.link = new Node(data);
        return;
    }

    public void prepend (int data){
        if (head == null){
            head = new Node(data);
            return;
        }

        Node newHead = new Node(data);
        newHead.link = head;
        head = newHead;
        return;
    }

    public void delete (int data){
        if (head == null)
            return;
        if (head.data == data){
            head = head.link;
            return;
        }
        Node current = head;
        while (current.link != null){
            if (current.link.data == data)
                current.link = current.link.link;
            return;
        }
    }



}
