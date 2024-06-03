import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;
class waterContainer_Arraylist2{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater =0;
        int lp=0;
        int rp = height.size()-1;
        while(lp<rp){
            //calculation water area
            int ht = Math.min(height.get(lp),height.get(rp));
            int width =rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(currWater,maxWater);
            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    } 
}
public class waterContainer_ArrayList {
    static void input(ArrayList<Integer> height){
        waterContainer_Arraylist2 ny = new waterContainer_Arraylist2();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<height.size();i++){
            int temp=sc.nextInt();
            height.add(i,temp);
        }
        for(int i=0;i<height.size();i++){
            System.out.print(height.get(i));
        }
    }
    public static void waterContainer(ArrayList<Integer> height){
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<height.size()-1;i++){
            for(int j=1;j<height.size();j++){
                int temp=Math.min(height.get(i),height.get(j));
                int temp2= j-i;
                int water=temp*temp2;
                if(water>max){
                    max=water;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>();
        waterContainer_Arraylist2 nc = new waterContainer_Arraylist2();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int x=nc.storeWater(height);
        System.out.println(x);
    }
}
