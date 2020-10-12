package Trees_Graphs;

import org.jetbrains.annotations.Contract;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
     Node root;

     public BinaryTree(int data){ root = new Node (data); }
     public BinaryTree(){ root = null;}

     public Node getRoot(){ return this.root; }

    public Node addIteratively (Node root, int data){
         if (root == null) { return root = new Node (data); }
         Node current = root;
         while(true){
             if (current.data < data) {
                 if (current.right != null) {
                     current = current.right;
                 } else {
                     current.right = new Node (data);
                     break;
                 }
             }
             if (current.data > data) {
                 if (current.left != null) {
                     current = current.left;
                 } else {
                    current.left = new Node (data);
                    break;
                 }
             }
         }
         return current;
    }

    public Node addRecursively (Node root, int data){
         if (root == null){  return  root = new Node (data);
                 }
         if (root.data < data){
             root.right = addRecursively(root.right,data);
         } else{
             root.left = addRecursively(root.left, data);
         }
         return root;
    }

    public void inOrderTraversal(Node root){
         if (root== null) {
              return;}
         inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public void preOrderTraversal(Node root){
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    public void postOrderTraversal(Node root){
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");

    }

    public void findingElement(int data, Node root){
        Node current = root;

             if (current == null) {
                 System.out.println("The data entered does not exist in the tree.");
                 return;
             }
             if (current.data == data) {
                 System.out.println("data found in tree!");
                 return;
             }

             if (data < current.data) findingElement(data, current.left);
             else { findingElement(data, current.right); }
    }

    // 3 cases for deleting an element: 1. no children at all. 2. node has only left/right child 3. node has 2 children

    public Node deleteElement (Node current, int data) {
        if (current == null) {
            System.out.println("Element " + data + " does not exits in the tree folks!");
            return null;
        } else if (current.data > data) {
            current.left = deleteElement(current.left, data);
        } // exploring left sub tree
        else if (current.data < data) {
            current.right = deleteElement(current.right, data);
        } // exploring right sub tree
        else { // found the node to delete!
            // case 1 : no children
            if (current.left == null && current.right == null) {
                return null;
            } // case 2: node has only left or right child respectively
            else if (current.right == null) {
                return current.left;
            } else if (current.left == null) {
                return current.right;
            }
            // case 3: node has 2 children, search the node on the right sub-tree with the minimum value
            else {
                Integer minVal = minimumValue(current.right);
                current.data = minVal;
                current.right = deleteElement(current.right, data);
            }
        }
        return current;
    }

        public Integer minimumValue (Node root){
         if (root.left != null) minimumValue(root.left);
         return root.data; }

    /*
    *       5
    *   -9     6
    *     0     98
    *  -20     2   7
    *
    * */

         public void createTree (){

         this.root = new Node(5);
         this.root.right =new Node(6);
         this.root.right.right =new Node(98);
         this.root.left =new Node (-9);
         this.root.left.right = new Node(0);
         this.root.right.right.left =new Node(7);
         this.root.left.right.right =new Node(2);
         this.root.left.right.left =new Node(-20);


    }
    // 1. pushing current node reference 2. pushing its children references to queue if exist 3. pop current node refrence off queue 4.continue looping until queue is empty.
    public void levelOrderBFS (Node current){
        if (current == null) { return; }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(current);

        while (!nodes.isEmpty()) {
            if (current.left != null) nodes.add(current.left);
            if (current.right != null) nodes.add(current.right);
            System.out.print (current.data + " ");
            nodes.remove(current);
            current = nodes.peek();

        }

    }


}
class Node {
    int data;
    Node left;
    Node right;

    public Node (int data){
        this.data = data;
        left =null; right = null;
    }

    public Node() {
    }
}