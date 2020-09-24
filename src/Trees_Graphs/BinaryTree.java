package Trees_Graphs;

import org.jetbrains.annotations.Contract;

import java.security.PublicKey;

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
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
    public void preOrderTraversal(Node root){
        if (root == null) return;
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    public void postOrderTraversal(Node root){
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);

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
             else {
                 findingElement(data, current.right);
             }
    }
    public void deleteElementIteratively (Node root,int data){
        if (root == null) { System.out.println("tree is null! "); return; }
        /*if (root.data == data) {
            what do we do here?
        }*/
        Node current = root;

        while (true){
            if (current.data > data){ // left subtree
                if(current.left != null){ //checking if left subtree exists
                    if (current.left.data == data && current.left.left != null ){
                        current.left = current.left.left; return;
                    } else if (current.left.left == null) { current.left = null; return;}
                }
            } else{
                if(current.right != null) {// checking if right subtree exists
                    if (current.right.data == data && current.right.right != null ){
                        current.left = current.right.right;
                        return;
                    } else if (current.right.right == null) { current.right = null;	return;	}
                }
            }  if (current.left == null && current.right == null){
                break;
            }
        }
        return;

    }

    public void createTree (){

         this.root = new Node(5);
         this.root.right =new Node(6);
         this.root.right.right =new Node(98);
       this.root.left =new Node (-9);
        this.root.left.right = new Node(0);
       this.root.right.right.left =new Node(7);
      this.root.left.right.right =new Node(2);

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