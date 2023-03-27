import java.util.*;
public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> al1=new ArrayList<>();

        al1.add(10);
        al1.add(6);
        al1.add(18);
        al1.add(3);
        for (int num: al1){
            System.out.println(num);
        }
        //for(int i=0; i<al1.size();i++){
        //System.out.println(al1.get(i));
        //}
        String someValue="300";
        int numericVal=Integer.parseInt(someValue);
        numericVal+=10;
        System.out.println(numericVal);
    }
}

