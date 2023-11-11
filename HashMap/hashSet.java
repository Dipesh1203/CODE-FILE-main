import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        System.out.println(set);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Indore");
        lhs.add("jaipur");
        System.out.println(lhs);
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Kanpur");
        ts.add("BHuranpur");
        ts.add("Ahemdabad");
        System.out.println(ts);
    }
}
