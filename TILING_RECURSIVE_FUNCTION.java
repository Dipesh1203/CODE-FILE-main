import java.util.*;
public class TILING_RECURSIVE_FUNCTION {
    public static int tiling(int n){
    if(n == 0 || n ==1){
        return 1;
    }
    //vertical
    int fnm1 = tiling(n-1);
    
    //horizontal choice
    int fnm2 = tiling(n-2);
    int totalways =fnm1+fnm2;
    return totalways;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }
}
