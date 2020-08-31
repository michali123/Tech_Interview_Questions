package LinkedLists;


import java.util.HashSet;
import java.util.Set;

public class SingleLinkedList {
    Node head;

    SingleLinkedList(int value){
        this.head = new Node(value);
    }
    public SingleLinkedList (){
        this.head = null;
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

    }

    public void appendFromleft(int data){
        if (head == null) {
            this.head = new Node(data);
            this.head = head.next;
        }
        Node buffer = head;
        head = new Node (data);
        head.next = buffer;

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
            System.out.print(current.data +" -> ");
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

    public Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node buffer;
        while (current != null){
            buffer = current.next;
            current.next = prev;
            prev = current;
            current = buffer;
        }
        return prev;
    }

    public boolean checkCycle (Node head){
        Set<Node> nodeSet = new HashSet<>();
        while (head != null){
            if (nodeSet.contains(head)){
                return true; }
                else {
                    nodeSet.add(head);
                }

                head = head.next;

            }
        return false;

    }
/*
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 */
    public Node oddAndeven (Node head){
        if (head == null) return  null;
        Node odd = head, even = head.next, evenHead = head;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    /* Given a non-negative integer represented as a non-empty singly linked list of digits, add one to the integer.
You may assume the integer do not contain any leading zero, except the number 0 itself.
The digits are stored such that the most significant digit is at the head of the list.
test cases: 9->1, 9->9->1, 9->null*/

    public Node addOne (Node head){
        // firstly we reverse the list
        head =  reverseList(head);
        Node curr = head;
        curr.data ++;

        while (curr.data == 10){
            curr.data = 0;
            if (curr.next != null) curr.next.data++;
            else {
                curr.next = new Node(1);
            }
        }
        return reverseList(head);
    }
    // reverse a singly linked list using recursion ex: 1->2->3->4->null
    public Node reverseRecursively(Node node){

        if (node == null || node.next == null) return node;

        Node head = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return head;
    }
}




