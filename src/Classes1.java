public class Classes1 {
    public static void main(String[] args){
        Classes myHouse=new Classes();
        Classes yourHouse=new Classes();

        myHouse.setNumStories(2);
        myHouse.setNumWindows(4);
        myHouse.setColour("Red");

        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(5);
        yourHouse.setColour("Blue");

        System.out.println("My house is "+myHouse.getNumStories()+" of stories and it has "+myHouse.getNumWindows()+" windows and it is of "+myHouse.getColour()+" colour.");

        System.out.println("Your house is "+yourHouse.getNumStories()+" of stories and it has "+yourHouse.getNumWindows()+"windows and it is of "+yourHouse.getColour()+" colour.");



    }
}
