public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public HourlyEmployee(String name, HireDate hireDate, double hourlyRate, int hoursWorked) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay(){
        double totalPay = hourlyRate * hoursWorked;
        return totalPay;
    }

}