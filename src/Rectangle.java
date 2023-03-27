

public class Rectangle {

    private double length;
    private double breadth;

    public static int numRectangle;

    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double length,double breadth){

        this.length=length;
        this.breadth=breadth;
        numRectangle++;

    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(int length){
        this.length=length;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public static int getNumRectangle(){
        return numRectangle;
    }
}
