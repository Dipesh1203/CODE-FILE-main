import java.util.*;
public class ispelindrome {
    public static boolean pelindrome(String word){
        boolean k = true;
        for(int i=0;i<(word.length()/2)-1;i++){
            if(word.charAt((word.length()/2)-i)==word.charAt((word.length()/2)+i)){
                k =true;
            }else{
                k= false;
            }
        }
        System.out.println(k);
        return k;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        pelindrome(word);

    }
}
