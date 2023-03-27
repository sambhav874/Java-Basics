import java.util.*;
public class MethodsOverloading { public static void main(String[] args){
    int sam=x2();
    System.out.println(sam);

    int rem=product();
    System.out.println(rem);

    int result=parser(4,"100");
    System.out.println(result);

    String result1=concat("Sambhav","Jain");
    System.out.println(result1);

}
    public static int x2(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        return n*2;
    }
    public static int product(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();

    return a*b;
    }
    public static int parser(int c,String as){

    return c*Integer.parseInt(as);
    }

    public static String concat(String a1,String a2){

    return a1 +" "+ a2;
    }
}
