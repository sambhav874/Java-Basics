
import java.util.*;
public class Proj6_1SumofElements {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>(5);
        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            int input=sc.nextInt();
            list.add(input);
        }
        int sum=sumElements(list);
        System.out.println("Sum is "+sum);
    }
    public static int sumElements(ArrayList<Integer> list1){
    int sum=0;
    for(int i=0;i<list1.size();i++){
        sum+=list1.get(i);
    }
    return sum;
    }
}
