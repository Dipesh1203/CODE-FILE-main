public class staircasesort {
    public static void sortmarix(int matrix[][],int key){
        int row=0,col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if( matrix[row][col]==key){
                System.out.println("key is found at ("+row+","+col+")");
                return ;
            }
            else if (key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return; 
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {21,29,37,48},
                          {32,33,39,50}};
        int key =33; 
        sortmarix(matrix, key);                          

    }
}
