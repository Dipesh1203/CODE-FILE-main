import java.util.*;
public class largestSubarraywithSum0 {
    public static void main(String args[]){
        int ar[] = {15,-2,2,-8,1,7,10}; 
        HashMap<Integer,Integer> sumIdx = new HashMap<>();
        int sum = 0 ;
         int len =0;
        for(int j=0;j<ar.length;j++){
            sum+=ar[j];
            if(sumIdx.containsKey(sum)){
                len = Math.max(len,j-sumIdx.get(sum));
            }else{
                sumIdx.put(sum,j);
            }
        }
        System.out.println("Largest subarray sum is:"+len);
    }
}
