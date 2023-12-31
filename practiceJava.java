import java.util.*;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

public class practiceJava {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
     public void rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                if(q.isEmpty())break;
                else q.add(null);
            }else {
                if(q.peek()==null)System.out.println(curr.val+" ");;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        // Connecting nodes to form a binary tree
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        
    }
}
