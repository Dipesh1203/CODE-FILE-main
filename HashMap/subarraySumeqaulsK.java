import java.util.*;
public class subarraySumeqaulsK {
    public static void main(String args[]){
        int arr[] = {1,2,3};
        int k =3;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int len = 0;
        int count = 0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j-map.get(sum));
                if(len == k ){
                    count++;
                }
            }else{
                    map.put(sum,j);
            }
        }
        System.out.println("No of subarrays are :"+count);
    }
        
}

