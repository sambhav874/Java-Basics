import java.util.*;
public class MethodsDemo {




    public static void main(String[] args){
        helloWorld();
        printNumber(15);
        int result=giveMe10();
        System.out.println(result);
        int result1=add_these(4,8);
        System.out.println(result1);
        double result3=square();
        System.out.println(result3);
    }

    public static void helloWorld(){
        System.out.println("Hello World!");
    }//void,parameterless

    public static void printNumber(int num){
        System.out.println("The number is "+num);
    }//void,parameterized

    public static int giveMe10(){
        return 10;
    }//value-returning ,parameterless

    public static int add_these(int c ,int b){
        return c+b;
    }//value-returning,parameterized
    public static double square(){
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        return num*num;
    }
}
