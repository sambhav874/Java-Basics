import java.util.*;
public class project3_2_DivisibleByThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check divisibility of 3 with:");
        int a=sc.nextInt();
        if(a%3==0) {
            System.out.println(a + " is divisible by 3.");
        }
        else{
            System.out.println(a+" is not divisible by 3.");
        }

    }
}
