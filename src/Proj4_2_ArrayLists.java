import java.util.*;
public class Proj4_2_ArrayLists {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> ar1=new ArrayList<>();

        double input;
        System.out.println("Enter 0 or more to put in the array list or negative number to exit.");
        input=sc.nextDouble();
        while(input>=0){
            ar1.add(input);
            System.out.println("Enter 0 or more to put in the array list or negative number to exit.");
            input=sc.nextDouble();
        }
        for(int i=0;i<ar1.size();i++){
            System.out.println(ar1.get(i));
        }

    }
}
