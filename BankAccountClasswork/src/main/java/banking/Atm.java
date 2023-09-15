package banking;

public class Atm {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Abu");
        bankAccount.setBalance(8000.00); // setBalance(double amount)
        bankAccount.setBalance(1000.00);
        System.out.println( bankAccount.getBalance() );
    }
}
