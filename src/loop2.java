
import java.util.*;
public class loop2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //counter++ => counter = counter + I
        for(int num1=0;num1<num+1;num1++){
            System.out.println(num1);
        }
        ;
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        if(n>2 & 5>n){
            System.out.println("Weird");
        }
    }
}
