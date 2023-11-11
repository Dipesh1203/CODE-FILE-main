import java.util.*;
public class uniqueSubstringUsingTrie {
    static class Node{
        Node childern[] = new Node[26];
        boolean eow = false;
        int freq;
        public Node(){
            for(int i=0;i<childern.length;i++){
                childern[i] = null;
            }
            freq=1;
        }
    }
    public static Node root= new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.childern[idx]==null){
                curr.childern[idx] = new Node();
            }else{
                curr.childern[idx].freq++;
            }
            curr=curr.childern[idx];
        }
        curr.eow = true;
    }
    public static void findPrefix(Node root,String ans){
        //TV = O(L) L =levels int tries or longest word
        if(root==null){
            return;
        }
        if(root.freq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.childern.length;i++){
            if(root.childern[i]!=null){
                findPrefix(root.childern[i], ans+(char)(i+'a'));
            }
        }
    }
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.childern[i]!=null){
                count += countNodes(root.childern[i]);
            }
        }
        return count+1;
    }
    public static String ans ="";
    public static void longestWord(Node root,StringBuilder temp){
        if(root==null){
            return ;
        }
        for(int i=0;i<26;i++){
            if(root.childern[i] !=null && root.childern[i].eow==true){
                char ch =(char)(i+'a');
                temp.append(ch);
                if(temp.length()>ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.childern[i], temp);
                temp.deleteCharAt(temp.length()-1);//backtrack
            }
        }
    }
    public static void main(String args[]){
        String arr[] = {"a","app","ap","appl","banana","apple","apply"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }


}
