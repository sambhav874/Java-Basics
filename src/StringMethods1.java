import sun.lwawt.macosx.CSystemTray;

import java.util.*;
public class StringMethods1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a.equals(b)){
            System.out.println("Your name is equal to Rob's name.");
        }
        else if(b.compareTo(a)>0){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println(a +" is greater than "+b);
        }
        for (int i=0;i<a.length();i++){
            System.out.print(a.charAt(i) + " ");
        }
    }
}
