import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameAges {
    public static void main(String[] args) {
        PrintWriter pw;
        Scanner namesFile;
        Scanner agesFile;
        try {
            namesFile = new Scanner(new File("/Users/sambhavjain/Desktop/Codes/Java/src/names.txt"));
            agesFile = new Scanner(new File("/Users/sambhavjain/Desktop/Codes/Java/src/ages.txt"));
            pw = new PrintWriter("/Users/sambhavjain/Desktop/Codes/Java/src/name_ages.txt");

            while(namesFile.hasNext()){
                String names=namesFile.nextLine();
                int ages=agesFile.nextInt();
                pw.println(names+" is "+ages+" years old.");
            }
            namesFile.close();
            agesFile.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println(e.getMessage());
        }
    }
}
