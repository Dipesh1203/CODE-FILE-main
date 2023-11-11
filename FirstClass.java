import java.lang.Math;
import java.util.*;
public class FirstClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char t='A';
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
                if(i == 1 ||j == 1|| i == n|| j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        

        for(i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                 System.out.print(j);
             }
 
            System.out.println();
        }


        
        
        
        
        
        }
    }
}

   
    
