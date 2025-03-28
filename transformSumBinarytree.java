import java.util.*;
public class transformSumBinarytree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left =null;
            this.right=null;
        }
    }
    public static int transformTree(Node root){
        if(root == null){
            return 0;
        }
        int leftsum=transformTree(root.left);
        int rightsum = transformTree(root.right);
        int temp=root.data;
        root.data = leftsum+rightsum;
        return root.data+temp;
    }
    public static void inorder(Node root){
        if(root == null ){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void main(String args[]){
        /*          1
                   / \
                  2   3
                 / \ / \
                4  5 6  7   
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inorder(root);
        
        transformTree(root);
        System.out.println();
        inorder(root);
    }
}