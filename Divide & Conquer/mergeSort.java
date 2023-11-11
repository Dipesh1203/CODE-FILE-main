import java.util.*;
public class mergeSort {
    public static void printArr(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        //left
        mergSort(arr, si, mid);
        //right
        mergSort(arr, mid+1, ei);
        //merge
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy to original arr
        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i]= temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] ={6,3,9,5,2,8};
        int si,ei;
        si=0;
        ei=arr.length-1;
        mergSort(arr, si, ei);
        printArr(arr);
    }
}
