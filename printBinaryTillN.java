import java.util.*;
import java.util.LinkedList;
public class printBinaryTillN {
    public static int binary(int x){
        int temp=x;
        int i=0;
        int binar =0;
        while(temp>0){
            binar += (temp%2)*Math.pow(10,i);
            temp = temp/2;
            i++;
        }
        return binar;
    }
    public static void printBinarTillN(int n){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(binary(i));
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String args[]){
        printBinarTillN(5);
    }
}
