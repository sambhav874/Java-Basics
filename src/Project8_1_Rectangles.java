
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project8_1_Rectangles {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangleList=new ArrayList<>();

        fillRectanglesList(rectangleList);
        printRectanglesList(rectangleList);
    }
    public static void fillRectanglesList(ArrayList<Rectangle> rectangleArrayList){
        try {
            Scanner sc = new Scanner(new File("/Users/sambhavjain/Desktop/Codes/Java/src/rectangle_data.txt"));

            double length;
            double width;
            Rectangle rec1;

            while (sc.hasNext()) {
                length = sc.nextDouble();
                width = sc.nextDouble();
                rec1 = new Rectangle(length, width);
                rectangleArrayList.add(rec1);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
            System.out.println(e.getMessage());
        }
        
    }
    public static void printRectanglesList(ArrayList<Rectangle> rectangleArrayList){

        for(Rectangle r:rectangleArrayList){
            System.out.println("Length: "+r.getLength());
            System.out.println("Width: "+r.getBreadth());
            System.out.println("Perimeter: "+r.perimeter());
            System.out.println("Area: "+r.area());
        }

    }
}
