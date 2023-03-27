
public class CountDown {
    public static void main(String[] args){
    CountDownFromSmallerToLarger(0);
    CountDownFromLargerToSmaller(120);
    CountUpTo(100,200);
    }
    public static void CountDownFromSmallerToLarger(int number) {
        if (number <= 120) {
            System.out.println(number);
            CountDownFromSmallerToLarger(number + 1);
        }
    }
    public static void CountDownFromLargerToSmaller(int number1){

        if(number1>=0){
            System.out.println(number1);
            CountDownFromLargerToSmaller(number1-1);
        }
    }

    public static void  CountUpTo(int number2,int number3){

        if(number2<=number3){
            System.out.println(number2);
            CountUpTo(number2+1,number3);

        }
}
}


