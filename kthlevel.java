import java.util.*;

public class kthlevel {
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
    public static void Klevel(Node root,int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root== null){
            return false;
        }
        path.add(root);
        if(root.data== n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lowestCommonAn(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i=0;
        //last common ancestor
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //last equal node->i-1th 
        Node lca = path1.get(i-1);
        return lca;

        
    }
    public static Node lca2(Node root,int n1,int n2){
        if(root == null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right,n1,n2);
        //
        if(rightlca== null){
            return leftlca;
        }
        if(leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root== null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right,n);
        if(leftDist==-1&&rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca = lca2(root,n1,n2);
        int dist1= lcaDist(root, n1);
        int dist2= lcaDist(root, n2);
        return dist1+dist2;
    }
    public static int kthAncestor(Node root,int n,int k){
        if(root== null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right,n,k);
        if(leftDist==-1&&rightDist==-1){
            return -1;
        }
        int max= Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
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
        System.out.println(lca2(root, 4, 6).data);
        System.out.println(minDist(root, 4, 6));
        kthAncestor(root, 4, 2);
    }
}
