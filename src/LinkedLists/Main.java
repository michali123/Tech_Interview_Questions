package LinkedLists;
import StringAndArrays.String_Arrays;
import Trees_Graphs.BinaryTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("\n This is a collection of coding interview practice questions." +
                "\n This project includes implementation of algorithms, as well as data structures knowledge. ");

        int exNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the ex. number for activation: ");
        exNumber = in.nextInt();

        // creating general list to use for our test cases
        SingleLinkedList generalList = new SingleLinkedList();
        generalList.append(5); generalList.append(4); generalList.append(76); generalList.append(89);
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
                    break;

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
                break;
            case 5: //Adding one to a linked list
                SingleLinkedList l1 = new SingleLinkedList(1);
                l1.append(9);
                System.out.print("Adding 1 to the number: ");
                l1.printList();
                System.out.println();
                System.out.println("Calculating...\n ..." );
                l1.addOne(l1.head);
                l1.printList();
                break;
            case 6: //Adding nodes at the beginning of the list
                SingleLinkedList l2 = new SingleLinkedList(1);
                l2.appendFromleft(3);
                l2.appendFromleft(5);
                l2.printList();
            case 7: // Reversing list recursively. (For testing we'll use l2 list created in case 6.)
                System.out.print("Current list to reverse: ");
                generalList.printList();
                SingleLinkedList node = new SingleLinkedList();
                node.head = generalList.reverseRecursively(generalList.head);
                System.out.print("\nList after recursive reverse: ");
                node.printList();

                // Strings and arrays manipulation
            case 8:
                String string = "cd", string1 = "aab", string3 = "mom";
                String_Arrays string_arrays = new String_Arrays();
                string_arrays.reversedString(string);
                string_arrays.reversedString(string1);
                string_arrays.reversedString(string3);
                break;
            case 9: char[] sentence = new char[] {'p','r','a','c','t','i','c','e',' ','m','a','k','e','s',' ','p','e','r','f','c','t'};
            String_Arrays st = new String_Arrays();
            st.reversingWords(sentence);
            System.out.println(Arrays.toString(sentence));

            case 10:
                BinaryTree bst= new BinaryTree(5);
                bst.addRecursively(bst.getRoot(), -54);
                bst.addRecursively(bst.getRoot(),8);
                bst.addRecursively(bst.getRoot(),-9);
                bst.addRecursively(bst.getRoot(),10);
                bst.inOrderTraversal(bst.getRoot());
                break;
            case 11: //checking if an element exits in our tree
                BinaryTree bst2= new BinaryTree(88);
                bst2.addRecursively(bst2.getRoot(), -54);
                bst2.addRecursively(bst2.getRoot(),8);
                bst2.addRecursively(bst2.getRoot(),-9);
                bst2.addRecursively(bst2.getRoot(),10);
               bst2.findingElement(10,bst2.getRoot());
                break;
            case 12: // Deleting an element from a binary tree
                BinaryTree binaryTree = new BinaryTree();
                binaryTree.createTree();
                System.out.println("Current tree:\n");
                binaryTree.inOrderTraversal(binaryTree.getRoot());
                binaryTree.deleteElement(binaryTree.getRoot(),0);
                System.out.println("Updated tree after deleting element: " + 0 + " is:\n");
                binaryTree.inOrderTraversal(binaryTree.getRoot());
                break;
            case 13: // BFS of a tree
                BinaryTree tree = new BinaryTree();
                tree.createTree();
                tree.levelOrderBFS(tree.getRoot());
                break;
            case 14:
                String  s = "win14   56      ";
                uniqueChar(s);
            case 15:
                String s1 = "mmr6y", s2 = "m6ymr";
                checkPermutation(s1,s2);
                checkPermutation2(s1,s2);

        }



   }
    public static boolean uniqueChar (String s){
        HashSet<Character> hs = new HashSet<>();
        for (int i =0; i< s.length(); i++){
            if (hs.contains(s.charAt(i)) && s.charAt(i) != ' ' ){
                System.out.println("String is not unique");
                return false; }
            else{
                hs.add(s.charAt(i)); }
        }
        System.out.println("String is unique");
        return true;
    }

    public static boolean checkPermutation(String s1, String s2){
        HashMap<Character,Integer> string1 = new HashMap<>();
        HashMap<Character,Integer> string2 = new HashMap<>();

        if (s1.length() != s2.length() ) {
            System.out.println("false"); return false; }
            for (int i = 0; i < s1.length(); i++) {

                if (string1.containsKey(s1.charAt(i))) {
                    int count = string1.get(s1.charAt(i));
                    string1.put(s1.charAt(i), count + 1);
                } else {
                    string1.put(s1.charAt(i), 1); }

                    if (string2.containsKey(s2.charAt(i))) {
                        int count = string2.get(s2.charAt(i));
                        string2.put(s2.charAt(i), count + 1);
                    } else {
                        string2.put(s2.charAt(i), 1);
                    }
                }

        if (string1 != string2) {  System.out.println("s1: " + string1.entrySet() + "\n s2: " + string2);
            return false;}
        else{
            System.out.println("s1: " + string1 + "\n s2: " + string2);
            return true; }
    }

    public static boolean checkPermutation2 (String s1, String s2) {
        int s1Sum = 0, s2Sum = 0;
        if (s1.length() != s1.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            s1Sum +=  s1.charAt(i);
            s2Sum +=  s2.charAt(i);

        }
        if (s1Sum == s2Sum) {
            System.out.println("true ");
            return true;
        }
        return false;
    }


}
