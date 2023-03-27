import java.util.*;
public class Proj3_3_GuessTheNumber {
    public static void main(String[] args){
        Random random=new Random();
        int myRandomNumber=random.nextInt(100)+1;
        int guessedCount=0;
        boolean guessNumber=false;
        Scanner sc=new Scanner(System.in);
        while(!guessNumber){
            System.out.println("Guess a number from 1 to 100:");
            int guessedNumber=sc.nextInt();
            guessedCount++;
            if(guessedNumber>=1 && guessedNumber<=100){
                if (guessedNumber>myRandomNumber){
                    System.out.println("Your guess was too high.");
                }
                else if(guessedNumber==myRandomNumber){
                    System.out.println("Congrats! You guessed right. You guessed the number in "+guessedCount+" guesses! Thanks for playing");
                    guessNumber=true;
                }
                else{
                    System.out.println("Your guess was too low.");
                }

            }
            else{
                System.out.println("That was a wasted guess.Pick a number between 1 and 100.");
            }


        }



    }
}
