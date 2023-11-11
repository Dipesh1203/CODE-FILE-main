import java.util.*;
public class spiralordermatrix {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][6];
        matrix[0][0] =1;
        matrix[0][1] =5;
        matrix[0][2] =7;
        matrix[0][3] =9;
        matrix[0][4] =10;
        matrix[0][5] =11;
        matrix[1][0] =6;
        matrix[1][1] =10;
        matrix[1][2] =12;
        matrix[1][3] =13;
        matrix[1][4] =20;
        matrix[1][5] =21;
        matrix[2][0] =9;
        matrix[2][1] =25;
        matrix[2][2] =29;
        matrix[2][3] =30;
        matrix[2][4] =32;
        matrix[2][5] =41;
        matrix[3][0] =15;
        matrix[3][1] =55;
        matrix[3][2] =59;
        matrix[3][3] =63;
        matrix[3][4] =68;
        matrix[3][5] =70;
        matrix[4][0] =40;
        matrix[4][1] =70;
        matrix[4][2] =79;
        matrix[4][3] =81;
        matrix[4][4] =95;
        matrix[4][5] =105;
        int row_start = 0;
        int column_start = 0;
        int row_end = 5;
        int column_end = 4; 
        for(int x=1;x<=3;x++){
            for(int j=x-1;j<=row_end-x;j++){
                int i=x-1;
                System.out.print(matrix[i][j]+" ");
            }
            for(int i=x-1;i<=column_end-x;i++){
                int j=row_end-x+1;
                System.out.print(matrix[i][j]+" ");
            }
            for(int j=row_end-x+1;j>=row_start+x-1;j--){
                int i=column_end-x+1;
                System.out.print(matrix[i][j]+" ");
            }
            for(int i=column_end-x;i>=column_start+x;i--){
                int j=x-1;
                System.out.print(matrix[i][j]+" ");
            }
        }
        

        
        
    }
}
