import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr1= new int[5];

        for(int j=0;j<arr1.length;j++){
            arr1[j]=sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            int result=arr1[i]*2;
            System.out.println("Result is "+result);

        }
    }
}
