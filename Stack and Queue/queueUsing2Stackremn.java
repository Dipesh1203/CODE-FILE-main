import java.util.*;
public class queueUsing2Stackremn {
    public static class queue2Stackrm{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            s1.push(data);
        } 
        public static int  remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.pop();
        }
        public static int peek(){
            if(s2.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s2.peek();
        }
    }
    public static void main(String args[]){
        queue2Stackrm k = new queue2Stackrm();
        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);
        
        while(!k.s1.isEmpty()){
            System.out.println(k.peek());
            k.remove();
        }
    }
}
