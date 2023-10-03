public class CheckCashingPlace {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("Messi", new HireDate("7", "21", "2023"), 500000.0);
        Employee hourlyEmployee = new HourlyEmployee("Cristiano", new HireDate("3", "15", "2019"), 15.0, 40);
        Entrepreneur entrepreneur = new Entrepreneur("Mbappe", 100000.0, 60000.0);

        HumanResources.printBadge(salariedEmployee);
        HumanResources hr = new HumanResources();

        Person[] payablePeople = {salariedEmployee, hourlyEmployee, entrepreneur};

        Employee[] employees = {salariedEmployee, hourlyEmployee};

        hr.issueBadge(employees);

        for (Employee payable : employees) {
            hr.printPaymentInfo(payable);
        }
    }

}
