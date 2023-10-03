public class HumanResources {
    public static void printBadge(Employee employee){
        String employeeName = employee.getName();
        System.out.println(employeeName);
    }
    public void issueBadge(Employee[] employees) {
       for (Employee employee : employees) {
            System.out.println(employee);
       }
    }
    public void printPaymentInfo(Employee employee) {
        System.out.println("Payment information for " + employee.getName());
        System.out.println("Payment amount: " + employee.calculatePay());
    }
}
