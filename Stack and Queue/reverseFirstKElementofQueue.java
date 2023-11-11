import java.util.*;
import java.util.LinkedList;
public class reverseFirstKElementofQueue {
    static class reverse{
        
    }
    public static Queue<Integer> reversek(int k,Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();

        while(k>0){
            s1.push(q.remove());
            k--;
        }
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
        while(!q.isEmpty()){
            q1.add(q.remove());
        }
        return q1;

    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> q2 = reversek(3, q);
        while(!q2.isEmpty()){
            System.out.println(q2.remove());
        } 
    }
}
