import composition.Size;

public class Clothing {
    private String description;
    private double price;
    private Size size;

    public Clothing(String description, double price, Size size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
