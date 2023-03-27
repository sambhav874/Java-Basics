import java.util.*;
public class java2D {
    public static void main(String[] args){
        int[][] array1=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array1.length;i++){
            for (int j=0;j<array1[i].length;j++){
                array1[i][j]=sc.nextInt();
        print(array1);
            }
        }
    }
    public static void print(int[][] arr1){
        for(int num1[]:arr1){
            for(int num2:num1){
                System.out.print(num2+" ");
            }
            System.out.println();
        }
    }
}
