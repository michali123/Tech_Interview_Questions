package Michal;

import java.security.PublicKey;
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
            case 4: //Checking if linkedList is cyclic or not using HashMap (we hash the nodes' references (addresses) and
                    //checking if a node's address exists in the list or not.
                SingleLinkedList cyclicList = new SingleLinkedList();
                cyclicList.append(2);
                cyclicList.append(3);
                cyclicList.append(5);
                cyclicList.append(8);
                System.out.println(cyclicList.checkCycle(cyclicList.head));
        }

    }

}
