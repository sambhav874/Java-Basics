import java.util.*;
public class RandomFun {
    public static void main(String[] args){
        Random random=new Random();
        int myRandomNumber;
        myRandomNumber=random.nextInt();
        System.out.println("Number is "+myRandomNumber);

        myRandomNumber=random.nextInt(1000);
        System.out.println("till 999? "+myRandomNumber);

        myRandomNumber=random.nextInt(1000)+1;
        System.out.println("till 1000?"+myRandomNumber);

    }
}
