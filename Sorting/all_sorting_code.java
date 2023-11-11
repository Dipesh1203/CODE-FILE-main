import java.util.*;
public class all_sorting_code {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minpos= i;
            for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr =arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void inbuiltsort(int arr[]){
        Arrays.sort(arr);
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String arg[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        insertionsort(arr);
        printarray(arr);

    }
}
