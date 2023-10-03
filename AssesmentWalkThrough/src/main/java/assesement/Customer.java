package assesement;

import java.util.Arrays;

public abstract class Customer extends Person{

    public Customer(String personName) {
        super(personName);
    }

    public Customer(String personName, Size size, Clothing[] clothing) {
        super(personName, size, clothing);
    }

    public static void printCustomerName(Customer customer){
        System.out.println("The customer's name is " +customer.getName());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", size=" + getSize() +
                ", clothingitems=" + Arrays.toString(getClothingitems()) +
                '}';
    }
}
