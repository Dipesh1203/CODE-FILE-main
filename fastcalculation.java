import java.util.*;
public class fastcalculation {
    public static int fastcalculation(int n,int a){
        int ans=1;
        while(a>0){
            if((a&1) !=0){
                ans*=n;
            }
            n=n*n;
            a=a>>1;
        }
        return ans;
    }
    
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a = sc.nextInt();
        System.out.println(fastcalculation(n,a));
    }
}
