import java.util.*;
import java.util.LinkedList;
public class maxOfContigeniousArr {
    public static void maxOfAllSubarr(int arr[]){
        Queue<Integer> q= new LinkedList<>();
        int i=0;
        while(i< arr.length-2){
            int temp = arr[i];
            temp=Math.max(temp,arr[i+1]);
            temp=Math.max(temp,arr[i+2]);
            q.add(temp);
            i++;
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1,4,5,2,3,6};
        maxOfAllSubarr(arr);
    }
}
