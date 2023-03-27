import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteNames {
    public static void main(String[] args){
        ArrayList<String> arr1=new ArrayList<>(5);
        String name;
        for(int i=0;i<6;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a name. ");
            name=sc.nextLine();
            arr1.add(name);
        }

        try{
            PrintWriter pw=new PrintWriter("/Users/sambhavjain/Desktop/Codes/Java/src/names.txt");
            for(int i=0;i< arr1.size();i++){
                pw.println(i);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}
