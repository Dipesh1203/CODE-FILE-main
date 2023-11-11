import java.util.*;
import java.util.TreeMap;

public class linkefHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>  lhm = new LinkedHashMap<>();
        lhm.put("india",500);
        lhm.put("USA",25);
        System.out.println(lhm);
        TreeMap<String,Integer>  tm = new TreeMap<>();
        tm.put("india",500);
        tm.put("USA",25);
        System.out.println(tm);
    }    
}
