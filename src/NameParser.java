import java.util.*;
public class NameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String a = sc.nextLine();
        int space = a.indexOf(" ");
        String a1 = a.substring(0, space);
        String a2 = a.substring(space + 1);

        a1=a1.toUpperCase();
        a2=a2.toLowerCase();
        System.out.println("First name is " + a1);
        System.out.println("Last name is " + a2);
    }

}
