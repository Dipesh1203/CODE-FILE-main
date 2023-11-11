import java.util.*;
public class majorityNumbers {
    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        LinkedHashMap<Integer,Integer> lhm = new  LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            lhm.put(arr[i],lhm.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> keySet = lhm.keySet();
        for(Integer key : keySet){
            if(lhm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }

    }
}
