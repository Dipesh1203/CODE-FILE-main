import java.util.ArrayList;

import org.hamcrest.core.Is;

public class binarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left = insert(root.left,val);
        }else{
            //right subtree
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean searchBST(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return searchBST(root.left, key);
        }
        else{
            return searchBST(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            //right subtree
            root.right = delete(root.right, val);
        }
        else if(root.data>val){
            //left subtree 
            root.left = delete(root.left, val);
        }
        else{//voila
            //case1
            if(root.left==null && root.right == null){
                return null;
            }
            //case2
            if(root.left==null){
                //right not null
                return root.right;
            }else if(root.right== null){
                //left not null
                return root.left;
            }

            //case 3
            Node IS =findInorderSuccessor(root.right);
            root.data = IS.data;
            //delete old is
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
        /*
        if(root.left == null){
            return root;
        }
        return findInorderSuccessor(root.left);
        */
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1&&root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min!=null && root.data <= min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        else{
            return isValidBST(root.left, min, root)&&isValidBST(root.right, root, max);
        }
    }
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node lefts=mirror(root.left);
        Node rights=mirror(root.right);
        root.left = rights;
        root.right = lefts;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node sortedToBBST(int arr[],int si,int ei) {
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node root = new Node(arr[mid]);
        root.left=sortedToBBST(arr, si, mid-1);
        root.right=sortedToBBST(arr, mid+1, ei);
        return root;

    }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node arrayListBalnacedBST(ArrayList<Integer> inorder,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node root = new Node(inorder.get(mid));
        root.left=arrayListBalnacedBST(inorder, si, mid-1);
        root.right=arrayListBalnacedBST(inorder,mid+1, ei);
        return root;
    }
    public static Node balcancedBST(Node root){
        //inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        //sorted inorder to balancedBST
        root =arrayListBalnacedBST(inorder, 0, inorder.size()-1);
        return root;
    }
    
    public static void main(String args[]){
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left= new Node(3);
        root.right= new Node(10);
        root.right.right=new Node(11);
        root.right.right.right = new Node(12);
        System.out.println();
        root =balcancedBST(root);
        preorder(root);
    }
}
