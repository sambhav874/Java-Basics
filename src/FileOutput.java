import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args){
        try{
            PrintWriter pw=new PrintWriter("/Users/sambhavjain/Desktop/Codes/Java/src/output.txt");
            pw.println("My name is Sambhav Jain.");
            pw.println("My work is to code.");
            pw.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Find is not found. So can't write in it.");

        }
    }
}
