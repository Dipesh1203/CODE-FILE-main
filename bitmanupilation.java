import java.util.*;
public class bitmanupilation {
    public static void oddoreven(int n){
        if((n&1) == 1){
            System.out.println("Given no is odd");
        }
        else{
            System.out.println("Given no is even");
        }

    }
    public static int countbit(int n){
        int count=0;
        while(n>0){
            if((n&1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void getbit(int n,int i){
        if((n&(1<<i)) !=0){
            System.out.println("Bit at ith is 1");
        }else{
            System.out.println("Bit ith is 0");
        }
    }
    public static int setbit(int n,int i){
        return (n|(1<<i));
    }
    public static int clearbit(int n,int i){
        return (n&(~(1<<i)));
    }
    public static int clear_last_Bit(int n,int i,int newBit){
        // if(newBit == 0){
        //     return clearbit(n, i);
        // }else{
        //     return setbit(n,i);
        // }
        int bitmask = (-1)<<i;

        return n& bitmask;
    }public static int clear_range_Bit(int n,int i,int j){
        
        int a =((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=sc.nextInt();
        int  j =sc.nextInt();
        System.out.println(clear_range_Bit(n, i,j));

    }
}
