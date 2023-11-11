import java.util.*;
public class pairSum_ArrayList {
    public static void pairSum(ArrayList<Integer> list){
        int nsum=5;

        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-1;j++){
                if((list.get(i)+list.get(j))==nsum){
                    System.out.println(list.get(i)+" , "+list.get(j));
                }
            }
        }
    }
    public static boolean pairSum_2pointerApproach(ArrayList<Integer> list){
        int lp =0;
        int target = 5;
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static boolean twopointers(ArrayList<Integer> list,int lp,int rp,int target){
        while(lp<rp){
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static boolean pairsum2(ArrayList<Integer> list,int target){
        int pivot =-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp= pivot+1;
        int rp = pivot;
        int n =list.size();
        while(lp !=rp){
            if(list.get(lp)+list.get(rp)== target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum2(list,16));
    }
}
