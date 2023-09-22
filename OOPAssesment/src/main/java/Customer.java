public abstract class Customer extends Person{
    @Override
    public String toString() {
        return "Customer{}";
    }

    public void printCustomerName(String name){
        System.out.println("This customers name is: " + name);
    }
}

