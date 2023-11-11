public class sum_of_diagonal_matrix {
    public static void sumdiagonal(int arr[][]){
        if(arr.length == arr[0].length){
            //common term
            int common_term=arr[arr.length/2][arr[0].length/2];
            int primary_sum=0;
            int secondary_sum=0;
            for(int i=0;i<arr.length;i++){
                primary_sum += arr[i][i];
                secondary_sum += arr[i][arr.length-1-i];
            }
            
            System.out.println("Primary diagonal sum is :"+primary_sum);
            System.out.println("Secondary diagonal sum is :"+secondary_sum);
            int totalsum=primary_sum+secondary_sum;
            if(arr.length%2 == 1 ){
                totalsum = totalsum-common_term;
            }
            System.out.println("Total diagonal sum is :"+totalsum);
        }
    }      
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{5,6,7},{9,10,11}};
        sumdiagonal(arr);
    }
}
