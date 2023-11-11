import java.util.*;
public class friends_pairing_problem {
    public static int friends_pairing(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }
        //single
        int fsing = friends_pairing(n-1);
        //paired
        int fpaired = (n-1)*friends_pairing(n-2);
        int totalways = fsing + fpaired;
        return totalways;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        System.out.println(friends_pairing(n));
    }
}
