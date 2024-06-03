import java.util.*;
public class print_Max_sumofsubArray {
    public static void maxsubsArray(int array[]){
        int prefix[] = new int[array.length];
        int maxsum=Integer.MIN_VALUE;
       
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int start=i;
                int end=j;
                int sum;
                sum = start == 0  ?prefix[end] : prefix[end]-prefix[start-1];
                // // for(int k=i;k<=j;k++){
                // //     sum += array[k];
                // // }
                // // System.out.println(sum);
                if(maxsum<sum){
                    maxsum=sum;
                }  
            }
            System.out.println();
        }

        System.out.println("maxsum is:"+maxsum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1,-2,6,-1,3};
        maxsubsArray(array);
    }
}
