import java.util.*;
public class calculateshortestditance {
    public static void displacmentcal(String word){
        int x=0,y=0;
        for(int i=0;i<word.length();i++){
            char dir =word.charAt(i);
            if(dir=='N'){
                y++;
            }
            if(dir=='S'){
                y--;
            }
            if(dir == 'W'){
                x--;
            }
            if(dir == 'E'){
                x++;
            }
        }
        float X2 =(x-0)*(x-0);
        float Y2 = (y-0)*(y-0);
        float diplacment = (float)Math.sqrt(X2+Y2);
        System.out.println(diplacment);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        displacmentcal(word);
        

    }
    
}
