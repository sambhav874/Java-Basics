import java.util.*;

public class SumFun {
    public static void main(String[] args){
        int sum=0;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a non-negative number:");
        System.out.println("Enter a negative value to exit.:");
        i=sc.nextInt();

        while(i>=0){
            sum+=i;
            System.out.println("Enter a non-negative number:");
            System.out.println("Enter a negative value to exit.:");
            i=sc.nextInt();
        }
        System.out.println("Sum is "+sum);
    }
}
