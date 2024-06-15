import java.util.*;
import java.io.*;

public class removeduplicate_string {
    public static void removeduplicate(String arr, int i, StringBuilder newStr, boolean map[]) {

        if (i == arr.length()) {
            System.out.println(newStr);
            return;
        }
        char currchar = arr.charAt(i);
        if (map[currchar - 'a'] == true) {
            removeduplicate(arr, i + 1, newStr, map);
        } else {
            map[currchar - 'a'] = true;
            removeduplicate(arr, i + 1, newStr.append(currchar), map);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr = "aappnnacolleege";

        removeduplicate(arr, 0, new StringBuilder(""), new boolean[26]);
    }
}
