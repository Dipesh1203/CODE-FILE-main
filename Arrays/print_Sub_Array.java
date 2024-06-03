import java.util.*;
public class print_Sub_Array {
    public static void subsArray(int array[]){
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();   
            }
            System.out.println();
        }

        System.out.println("maxsum is:"+maxsum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {2,3,7,8,9,10};
        subsArray(array);
    }
}
