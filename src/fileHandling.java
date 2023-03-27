import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.*;
public class fileHandling {
    public static void main(String[] args){
        Scanner infile;
        try{
            infile=new Scanner(new File("/Users/sambhavjain/Desktop/Codes/Java/src/input.txt"));
            int input;
            int sum=0;

            while(infile.hasNext()){
                input=infile.nextInt();
                System.out.println(input);
                sum+=input;


            }
            System.out.println("Sum is "+sum);
            infile.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Cant find file.");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ax){
            System.out.println("Error Reading file.");
        }
    }
}
