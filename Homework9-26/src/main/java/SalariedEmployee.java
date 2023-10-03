public class SalariedEmployee extends Employee {
    private double salary;
    public SalariedEmployee(String name, HireDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double calculatePay(){
        double totalWeeklyPay = salary / 12 / 4;
        return totalWeeklyPay;
    }
}
