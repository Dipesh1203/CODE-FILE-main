import java.util.*;
import java.util.LinkedList;
public class nRopesQueue {
    public static void sortQueue(Queue<Integer> q){
        ArrayList<Integer> ar = new ArrayList<>();
        while(!q.isEmpty()){
            ar.add(q.remove());
        }
        Collections.sort(ar);
        int i=0;
        while(ar.size()>0){
            q.add(ar.remove(i));
        }
        
    } 
    static int nropes(Queue<Integer> q){
        int cost=0;
        sortQueue(q);
        while(q.size()>1){
            int min= q.remove();
            int min2=q.remove();
            cost+=min+min2;
            System.out.print(cost+" ");
            q.add(min+min2);
            sortQueue(q);
        }
        return cost;
    }
    public static void main(String args[]){
        int arr[] ={4,3,6,1,2};
        Queue<Integer> q = new LinkedList<>();
        int i =0;
        while(i<arr.length){
            q.add(arr[i]);
            i++;
        }
        System.out.println(nropes(q));
    }
}
