package dayTwo;

//Circle is_a Shape = Inheritance
//Child - Subclass
//Parent - Superclass
public class Circle extends Shape {

    public Circle(String someColor, double side) {
        super(someColor);
        this.side = side;
    }

    @Override //Annotation
    public double calculateArea () {
        return Math.PI * this.side * this.side;
    }

}