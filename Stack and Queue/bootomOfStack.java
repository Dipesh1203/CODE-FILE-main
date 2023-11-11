import java.util.*;
public class bootomOfStack {
    public static void  pushAtButoom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushAtButoom(s, data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtButoom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
