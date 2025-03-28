import java.util.*;
public class nextGreaterElement {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int nxtGreater[] = new int[arr.length];
        Stack<Integer> s= new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //step 2 condition
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //3 push
            s.push(i);

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
    }
}
