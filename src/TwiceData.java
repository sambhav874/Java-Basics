import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args){
        Scanner sc;
        PrintWriter pw;

        try{
            sc=new Scanner(new File("/Users/sambhavjain/Desktop/Codes/Java/src/nums.txt"));
            pw=new PrintWriter("/Users/sambhavjain/Desktop/Codes/Java/src/twice_nums.txt");

            while(sc.hasNext()){
                int i=sc.nextInt();
                i*=2;
                pw.println(i);
                }
            pw.close();
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
            System.out.println(e.getMessage());
        }
    }
}
