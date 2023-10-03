package assesement;

public abstract class Employee extends Customer implements Discountable{
    private final double DISCOUNT = .10;
    public double getDISCOUNT() {
        return DISCOUNT;
    }
    public Employee(String personName) {
        super(personName);
    }
    public Employee(String personName, Size size, Clothing[] clothing) {
        super(personName, size, clothing);
    }

    public abstract void printEmployeePriceAfterDiscount(Clothing clothing);



}
