import java.util.*;
public class Writeaprogramtoenterthenumberstilltheuserwantsandattheendit{
    public static void inputProgram(int n) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        int z=0;
        for(int i=1;i<=n;i++){
            int g =sc.nextInt();
            if(g>0){
                x=x+1;
            }
            if(g<0){
                y=y+1;
            }
            if(g==0){
                z=z+1;
            }
            else{
            } 
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);   
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inputProgram(n);
    }
}
