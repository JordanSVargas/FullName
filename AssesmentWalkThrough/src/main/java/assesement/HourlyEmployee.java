package assesement;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name){
        super(name);
    }
    public HourlyEmployee(String personName, Size size, Clothing[] clothing) {
        super(personName, size, clothing);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {
        double finalDiscount = getDISCOUNT();
        double calculateDiscount = clothing.getPrice() * finalDiscount;
        double finalPrice = clothing.getPrice() - calculateDiscount;
        System.out.println(finalPrice);
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
