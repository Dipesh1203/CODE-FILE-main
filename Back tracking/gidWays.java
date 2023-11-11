import java.util.*;
public class gidWays {
    static int gridWays(int grid[][],int count,int x,int y){
        //base case
        if(x==grid.length-1 && y==grid[0].length-1){
            return 1;
        }else if(x==grid.length || y== grid[0].length){
            return 0;
        }
        //choice
        //down
        int w1= gridWays(grid, count+1, x+1, y);
        //right
        int w2=gridWays(grid, count+1, x, y+1);
        return w1+w2;
        
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=3;
        int m=3;
        int grid[][] =new int[n][m];
        System.out.println(gridWays(grid,0,0,0));

    }
}
