import java.util.*;
public class maxsubarraykadans {
    public static void maxSubsArrayKadans(int array[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<array.length;i++){
            cs += array[i];
            if(cs<0 ){
                cs =0;
            }
            ms=Math.max(cs, ms);
            System.out.println();
        }
        //when all the values in Strings are (- ve) special case of Kadan's
        if(ms == 0){
            ms=Integer.MIN_VALUE;
            for(int i=0;i<array.length;i++){
                cs +=array[i];
                ms=Math.max(cs, ms);
                System.out.println();
            }

        }

        System.out.println("maxsum is:"+ms);

    }
    public static void main(String args[]){
        int array[] = {-1,-2,-3,-5};
        maxSubsArrayKadans(array);
    }
}
