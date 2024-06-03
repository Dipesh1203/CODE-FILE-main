package Arrays;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void print_ArrayList(ArrayList<Integer> DSA) {
        for (int i = 0; i <= DSA.size() - 1; i++) {
            System.out.print(DSA.get(i));
        }
    }

    public static void swap_2(ArrayList<Integer> DSA, int idx1, int idx2) {

        int temp = DSA.get(idx1);
        DSA.set(idx1, DSA.get(idx2));
        DSA.set(idx2, temp);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> DSA = new ArrayList<>();
        DSA.add(2);
        DSA.add(5);
        DSA.add(9);
        DSA.add(3);
        DSA.add(6);
        System.out.println(DSA);
        Collections.sort(DSA);
        System.out.println(DSA);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
    }
}
