
public class Rectangle1 {
    public static void main(String[] args){
        Rectangle rec1=new Rectangle();
        Rectangle rec2=new Rectangle();

        rec1.setLength(4);
        rec1.setBreadth(6);
        System.out.println("The area of Rectangle 1 is "+rec1.area()+" for length "+ rec1.getLength()+" and breadth "+rec1.getBreadth());
        System.out.println("The perimeter of Rectangle 1 is "+rec1.perimeter()+" for length "+ rec1.getLength()+" and breadth "+rec1.getBreadth());

        rec2.setLength(10);
        rec2.setBreadth(14);
        System.out.println("The area of Rectangle 2 is "+rec2.area()+" for length "+ rec2.getLength()+" and breadth "+rec2.getBreadth());
        System.out.println("The perimeter of Rectangle 2 is "+rec2.perimeter()+" for length "+ rec2.getLength()+" and breadth "+rec2.getBreadth());

        Rectangle rec3=new Rectangle(15,9);
        System.out.println("The area of Rectangle 3 is "+rec3.area()+" for length "+ rec3.getLength()+" and breadth "+rec3.getBreadth());
        System.out.println("The perimeter of Rectangle 3 is "+rec3.perimeter()+" for length "+ rec3.getLength()+" and breadth "+rec3.getBreadth());

        System.out.println("The rectangle count till now is "+Rectangle.getNumRectangle());
    }
}
