import java.util.*;
public class DiceSimulation {
    public static void main(String[]args){
        Random random=new Random();
        int outcome;

        for(int i=1;i<11;i++){
            outcome=random.nextInt(6)+1;
            System.out.println("Dice Outcome is "+outcome);
        }
    }
}
