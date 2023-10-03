package assesement;

public class MainStore {
    public static void main(String[] args) {

        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.SMALL);
        Clothing tShirt = new Clothing("White T Shirt", 5.0,"SMALL);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, "LARGE");
        Clothing[] clothingItems = {jeans, tShirt, buttonUp};
        Manager manager = new Manager("Bob", Size.LARGE,clothingItems);
        manager.printEmployeePriceAfterDiscount(jeans);



//        Customer customer = new Customer("Jordan");
//        Customer customer1 = new Customer("Naruto");
//
//        Customer.printCustomerName(customer);
//    }
    }
}
