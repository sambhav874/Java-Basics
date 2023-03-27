
import java.util.*;
public class Proj5_1_NamePermutations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        ArrayList<String> firstName=new ArrayList<>();
        ArrayList<String> lastName=new ArrayList<>();
        int space;
        String fName;
        String lName;

        for(int i=0;i<5;i++){
            System.out.println("Enter your name.");
            String name=sc.nextLine();
            space=name.indexOf(" ");
            fName=name.substring(0,space);
            lName=name.substring(space+1);
            firstName.add(fName);
            lastName.add(lName);
            System.out.println(firstName);
            System.out.println(lastName);
        }
        for (int j=0;j<firstName.size();j++){
            for (int k=0;k< lastName.size();k++){
                System.out.println(firstName.get(j)+" "+lastName.get(k));
            }
        }

    }
}
