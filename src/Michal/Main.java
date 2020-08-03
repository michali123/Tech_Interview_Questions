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
        }

    }

}
