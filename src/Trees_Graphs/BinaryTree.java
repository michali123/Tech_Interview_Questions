package Trees_Graphs;

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
         if (root== null) return;
         Node current = root;
         inOrderTraversal(current.left);
        System.out.println(current.data);
        inOrderTraversal(current.right);
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

}