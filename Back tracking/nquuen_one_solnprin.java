import java.util.*;
public class nquuen_one_solnprin {
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //digonally leftup
        for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //digonally rightup 
        for(int i=row-1, j=col+1;i>=0 &&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }  
        return true;
    }
    public static boolean nqueen(char board[][],int row){
        if(row == board.length){
            print(board);
            count++;
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nqueen(board,row +1)){
                    return true;
                }
                board[row][j]='.';
            }
        }
        return false;
    }
    static int count =0;
    public static void print(char arr[][]){
        System.out.println("--------chess borad---------");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =5;
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        if(nqueen(board, 0)){
            System.out.println("Solution is possible");
            print(board);
        }else{
            System.out.println("Solution is not possible");

        }
        

    }
}
