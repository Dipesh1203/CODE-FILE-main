import java.util.*;
public class hashMap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",10);
        hm.put("indonesia",2);
        hm.put("usa",5);
        hm.put("China",9);
        System.out.println(hm); 
        Set<String> key = hm.keySet();
        System.out.println(key);
        //iteration 
        for (String k : key) {
            System.out.println("key = "+k+", value = "+hm.get(k));
        }
    }

}
