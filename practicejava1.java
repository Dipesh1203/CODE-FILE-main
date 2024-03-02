import java.util.*;

public class practicejava1 {
    public static void subarray(int arr[], Set<ArrayList<Integer>> list) {
        for (int i = 0; i < arr.length; i++) {
            // single
            ArrayList<Integer> arr1 = new ArrayList<>();
            arr1.add(arr[i]);
            // from start to i

            ArrayList<Integer> arr2 = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                arr2.add(arr[j]);
            }
            // from i to end
            ArrayList<Integer> arr3 = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                arr3.add(arr[j]);
            }
            // i to n-i
            ArrayList<Integer> arr4 = new ArrayList<>();
            for (int j = i; j <= arr.length - i - 1; j++) {
                arr4.add(arr[j]);
            }
            list.add(arr1);
            list.add(arr2);
            list.add(arr3);
            list.add(arr4);
        }
    }

    public static void printSet(Set<ArrayList<Integer>> list) {
        for (ArrayList<Integer> a : list) {
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 11, 81, 94, 43, 3 };
        Set<ArrayList<Integer>> list = new HashSet<>();
        subarray(arr, list);
        printSet(list);
        int sum = 0;
        for (ArrayList<Integer> a : list) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < a.size(); i++) {
                min = Math.min(a.get(i), min);
            }
            if (min != Integer.MAX_VALUE)
                sum += min;
        }
        System.out.println("->" + sum);

    }
}