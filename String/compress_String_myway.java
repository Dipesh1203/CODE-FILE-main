package String;

import java.util.*;

public class compress_String_myway {
    public static void printstring(StringBuilder str1) {
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
    }

    public static String stringCompress(StringBuilder str1) {
        int count = 0;
        StringBuilder str2 = new StringBuilder("");
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
                if (i == str1.length() - 2) {
                    str2.append(str1.charAt(str1.length() - 1));
                    str2.append(count + 1);
                    count = 0;
                }
            } else {
                count++;
                str2.append(str1.charAt(i));
                str2.append(count);
                count = 0;
                if (i == str1.length() - 2) {
                    str2.append(str1.charAt(str1.length() - 1));
                    str2.append(count + 1);
                }
            }
        }

        return str2.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(stringCompress(str1));

    }
}
