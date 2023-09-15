package banking;

//Inheritance - is A Relationship
public class BankAccount extends Account{

    private double balance; //ivar, property, field, attribute

    public BankAccount(String userAccountName) {
        super(userAccountName);
    }
    //A getter method
    public double getBalance(){
        return this.balance;
    }

    //A setter method
    public void setBalance(double amount){
        if(amount < 0){
            System.out.println(" error");
        } else{
            this.balance = this.balance + amount;
        }



    }


}