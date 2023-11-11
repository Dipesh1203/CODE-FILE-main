import java.util.*;
public class ratMaze {
    public static void move(int arr[][],int x,int y){
        if(x==arr.length-1 && y==arr[0].length-1){
            arr[x][y]=2;
            return;
        }
        if(x<arr.length-1){
            //vertically down
            if(arr[x+1][y]==1){
                arr[x][y]=2;
                move(arr, x+1, y);
            }
        }
        if(y<arr[0].length-1){
            //right
            if(arr[x][y+1]==1){
                arr[x][y]=2;
                move(arr, x, y+1);
            }
        }
        else if(!(x>0)){
            arr[x][y]=0;
            move(arr, x, y-1);
        }
        else if(!(y>0)){
            arr[x][y]=0;
            move(arr, x-1, y);
        }
       
        return;
    }

    
    public static void print(int arr[][]){
        System.out.println("----------------");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 1, 1 },
                        { 0, 0, 0, 1 },
                        { 1, 1, 1, 1 } };
        print(arr);
        move(arr, 0, 0);
        print(arr);
    }
}
