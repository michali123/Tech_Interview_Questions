package LinkedLists;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n This is a collection of coding interview practice questions." +
                "\n This project includes implementation of algorithms, as well as data structures knowledge. ");

        int exNumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the ex. number for activation: ");
        exNumber = in.nextInt();

        switch (exNumber){
            case 1 :
                Recursion recursion = new Recursion();
                System.out.println(recursion.sum(5));
                    break;
            case 2: StringManipulation stringManipulation = new StringManipulation();
                    stringManipulation.permutation("ABC");
                break;
            case 3: // LinkedList appending and printing, classes used: Node, SingleLinkedList
                SingleLinkedList myList = new SingleLinkedList(1);
                myList.append(2);
                myList.append(6);
                myList.append(9);
                myList.printList();
                int size = myList.listSize();
                System.out.println("Size of list:" + size);
                String testing ="";
                Node current = myList.head;
                while (current != null){
                    testing += current.data;
                    current = current.next;

                }
                System.out.println("print the string" + testing);
            case 4: //Checking if linkedList is cyclic or not using HashMap (we hash the nodes' references (addresses) and
                    //checking if a node's address exists in the list or not.
                SingleLinkedList cyclicList = new SingleLinkedList();
                cyclicList.append(2);
                cyclicList.append(3);
                cyclicList.append(5);
                cyclicList.append(8);
                System.out.println(cyclicList.checkCycle(cyclicList.head));
            case 5: //Adding one to a linked list
                SingleLinkedList l1 = new SingleLinkedList(1);
                l1.append(9);
                System.out.print("Adding 1 to the number: ");
                l1.printList();
                System.out.println();
                System.out.println("Calculating...\n ..." );
                l1.addOne(l1.head);
                l1.printList();
            case 6: //Adding nodes at the beginning of the list
                SingleLinkedList l2 = new SingleLinkedList(1);
                l2.appendFromleft(3);
                l2.appendFromleft(5);
                l2.printList();
        }



    }

}
