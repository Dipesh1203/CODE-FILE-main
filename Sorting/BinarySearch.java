import java.util.*;
import java.lang.Math;
public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
        int start=0,end=(numbers.length-1);
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid] == key){
                //found
                return mid;
            }
            if(numbers[mid] < key){
                //right half
                start = mid -1;

            }
            if(numbers[mid]>key){
                //left half
                end= mid-1;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,4,5,9,10,11,12,16,17};
        int key;
        key=sc.nextInt();
        System.out.println("index of key is "+binarySearch(numbers, key));
    } 
    
}
