import java.util.*;
public class oops {
    public static void main(String args[]){
        college clg = new college();
        Scanner sc = new Scanner(System.in);
        clg.Id_name="Dipesh Prajapat";
        clg.branch="EI";
        String pwd = "ABCD";
        clg.marks[0]=100;
        clg.marks[1]=111;
        clg.marks[2]=125;
        clg.setpassword(pwd);
        System.out.println(clg.getId_name());
        college clg2 = new college(clg);


    }
    
}
class college{
    public String Id_name;
    public String branch;
    private String password;
    int marks[];

    public void setpassword(String pwd){
        this.password = pwd;
    }
    String getId_name(){
        marks = new int[3];
        return this.Id_name;
    }
    college(){
        marks = new int[3];

    }
    college(college clg){
        marks = new int[3];
        this.Id_name = clg.Id_name;

    }

}
