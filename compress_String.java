import java.util.*;
public class compress_String {
    public static String compress(String str){
        String str1 = "";
        for(int i=0;i<str.length()-1;i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str1 += str.charAt(i);
            if(count>1){
                str1 += count.toString();
            }

        }
        return str1;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        str.toString();
        System.out.println(compress(str));
        
    }
}
