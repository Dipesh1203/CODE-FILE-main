import java.util.*;
public class heightOFBinaryTree {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1; 

    }
    public static int sumTree(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumTree(root.left);
        int rightsum = sumTree(root.right);
        return leftsum+rightsum+root.data; 

    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc+rc+1; 

    }
    public static int diameter2BinaryTree(Node root){
        if(root == null){
            return 0;
        }
        int ldia = diameter2BinaryTree(root.left);
        int lh= height(root.left);
        int rdia = diameter2BinaryTree(root.right);
        int rh = height(root.right);

        int selfdiameter = lh + rh +1;
        return Math.max(selfdiameter,Math.max(ldia,rdia));
    }
    static class Info{
        int dia;
        int ht;
        Info(int dia,int ht){
            this.dia = dia;
            this.ht = ht ;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(dia,ht);
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
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sumTree(root));
        System.out.println(diameter2BinaryTree(root));
        System.out.println(diameter(root).dia);


    }
}
