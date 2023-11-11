public class substringcalculation {
    public static void substring(String arr,String ans,int i){
        //base case
        if(i==arr.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            
            return;
        }
        //choice
        substring(arr,ans+arr.charAt(i), i+1);
        substring(arr,ans, i+1);
    }
    public static void main(String args[]){
        String arr = "abc";
        substring(arr, "", 0);
    }
}
