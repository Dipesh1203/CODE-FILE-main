import java.util.*;
public class validAnagrams {
    public static HashMap<Character,Integer> countAlphaBet(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        String s = "heart";
        String t = "earth";
        if(countAlphaBet(s).equals(countAlphaBet(t))){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
    }
}
