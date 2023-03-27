import java.util.*;
public class Fraternity {
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fraternity,a social organization on university campuses for males,\n typically found in North American universities");

        System.out.println("Enter your gender");
        String gender=sc.next();
        System.out.println("Enter your age.");
        int age=sc.nextInt();

        if(age>=19 && gender=="M"){
            System.out.println("You can join fraternity.");
        }
        else{
            System.out.println("You are not eligible to join fraternity.");
        }

    }
}
