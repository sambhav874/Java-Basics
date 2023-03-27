import java.util.*;
public class ArrayListsFun {
    public static void main(String[] args){
        ArrayList<String> arrayList1= new ArrayList<>();

        arrayList1.add("Sambhav");
        arrayList1.add("likes");
        arrayList1.add("to");
        arrayList1.add("be");
        arrayList1.add("a");
        arrayList1.add("loner");

        for(int i=0;i<arrayList1.size();i++){
            System.out.println(arrayList1.get(i));
        }

    }
}
