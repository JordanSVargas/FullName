package assesement;

public class Manager extends Employee {

    private final double MANAGER_DISCOUNT = 0.05;

    public Manager(String personName){
        super(personName);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {
        double finalDiscount = MANAGER_DISCOUNT + getDISCOUNT();
        double calculateDiscount = clothing.getPrice() * finalDiscount;
        double finalPrice = clothing.getPrice() - calculateDiscount;
        System.out.println(finalPrice);

    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
