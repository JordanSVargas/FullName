import dayTwo.Shape;

public class Rectangle extends Shape {
    public double width;
    //Constructor
    public Rectangle(String someColor, double side, double width) {
        super(someColor);
        this.side = side;
        this.width = width;
    }

    @Override //Annotation
    public double calculateArea () {
        return this.side * this.width;
    }


}
