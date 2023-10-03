package assesement;

public class Student extends Customer implements Discountable{
    private long studentID;

    private final double DISCOUNT = 0.05;

    public Student(String personName, long studentID) {
        super(personName);
        this.studentID = studentID;
    }

    public Student(String personName, Size size, Clothing[] clothing, long studentID) {
        super(personName, size, clothing);
        this.studentID = studentID;
    }

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
