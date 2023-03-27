import java.util.*;
public class Proj4_3_Parallel {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr1=new int[5];
        ArrayList<String> arrL=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter your name.\t");
            String input=sc.next();
            arrL.add(input);
            System.out.println("Enter your age.\t");
            arr1[i]=sc.nextInt();
        }

        for(int k=0;k<5;k++){
            System.out.println(arrL.get(k)+" is "+arr1[k]+" years old.");}


    }
}
