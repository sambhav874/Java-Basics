
import java.util.*;

public class twoDArrayFun {
    public static void main(String[] args){
        int[][] my2dArray=new int[2][3];
        int[][] arra1=new int[2][2];
        fill2DArray(my2dArray);
        print2DArray(my2dArray);
        twice2DArray(arra1);
        print2x(arra1);

    }

    public static void fill2DArray(int[][] twoDarr){
        Random rand=new Random();
        for(int i=0;i<twoDarr.length;i++){
            for(int j=0;j<twoDarr[i].length;j++){
                twoDarr[i][j]=rand.nextInt(100);
            }
        }
    }
    public static void print2DArray(int[][] twoDarr){
        for(int[] num: twoDarr){
            for( int num2:num) {
                    System.out.print(num2+ " ");
            }
            System.out.println();
        }
    }
    public static void twice2DArray(int[][] arr1){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
    }
    public static void print2x(int[][] arr1){
        for(int num[]:arr1){
            for(int num2:num){
                System.out.print(2*num2+" ");
            }
            System.out.println();
        }
    }
}
