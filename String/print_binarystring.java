import java.util.*;
public class print_binarystring {
    public static void cons_one_string(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        cons_one_string(n-1, 0, str+'0');
        if(lastplace == 0){
            cons_one_string(n-1, 1, str+'1');
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int i=0;
        cons_one_string(n, i, "");
    }
}
