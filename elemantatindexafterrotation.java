import java.util.*;
public class elemantatindexafterrotation {
    public static void elementatindex(int nums[],int k){
        int newnum[] = new int[nums.length]; 
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int j=k+i;
            if(j<nums.length){
                newnum[i] = nums[j];
            }else{
                newnum[i] = nums[sum];
                sum++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(newnum[i]);
        }

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int nums[] = {1,2,3,4,5,6,7};
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }System.out.println();
        int k= sc.nextInt();
        elementatindex(nums, k);
    }
}
