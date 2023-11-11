import java.util.*;
public class validParenthesis {
    public static boolean isVaild(Stack<Character> s,String str){
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='{' ||ch =='(' ||ch =='[' ){
                //opening
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}')||(s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Stack<Character> s = new Stack<>();
        String str = "({[}[)";
        isVaild(s, str);
        System.out.println(isVaild(s, str));
    }
}
