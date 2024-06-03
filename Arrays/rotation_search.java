import java.util.*;
public class rotation_search {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        //
        if(arr[si] <=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<= tar && tar<= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static int searchitrattion(int arr[],int tar,int si,int ei){
        int mid = si -(-ei+si)/2;
        for(int i=0;i<=mid;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        for(int i=mid+1;i<=ei;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]= {4,5,6,7,0,1,2};
        int tar = 0;
        int si=0;
        int ei=arr.length-1;
        int tarindx = searchitrattion(arr, tar, si, ei);
        System.out.println(tarindx);

    }
}
