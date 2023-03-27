public class BankAcc {
    public static void main(String[] args){
        BankAccount user1=new BankAccount("Sambhav",5000);
        BankAccount user2=new BankAccount("Varun");

        user2.deposit(4000);
        System.out.println("The bank account holder name is : "+user2.getOwner());
        System.out.println("The available amount is "+user2.getBalance());

        user1.withdraw(4000);
        System.out.println("The bank account holder name is "+user1.getOwner());
        System.out.println("The available amount is "+user1.getBalance());
    }
}
