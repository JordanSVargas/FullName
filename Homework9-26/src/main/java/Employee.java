public class Employee extends Person {
    private HireDate hireDate;
    public Employee(String name, HireDate hireDate) {
        super(name);
        this.hireDate = hireDate;
    }
    public HireDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
    public void printBadge(Employee[] employees) {
        System.out.println("=============================");
        System.out.println("Name: " + getName());
        System.out.println("Type of employee: " + this.getClass().getSimpleName());
        System.out.println("HireDate: " + hireDate.getMonth() + "/" + hireDate.getDate() + "/" + hireDate.getYear());
        System.out.println("=============================");
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
