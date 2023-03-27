import java.util.*;
public class array2 {
    public static void main(String[] args){
        int[] arr;
        Scanner sc=new Scanner(System.in);
        arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+(i+1)+" element.");
            arr[i]=sc.nextInt();
        }
        for(int arr1:arr){
            System.out.println(arr1);
        }
    }
}
