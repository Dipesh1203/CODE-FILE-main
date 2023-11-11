import java.util.*;
public class TOWEROFHANOI {
    public static void towerofhanoi(int n,char src,char dest,char help){
        if(n==1){
            System.out.println("move disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofhanoi(n-1, src, help, dest);
        System.out.println("move disk "+n+" from" +src+" to "+dest);
        towerofhanoi(n-1, help, dest, src);


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofhanoi(n, 'A', 'B', 'C');
        

    }
}
