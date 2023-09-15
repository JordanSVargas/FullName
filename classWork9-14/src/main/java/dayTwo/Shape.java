package dayTwo;

//Class - a blueprint for creating shapes
public abstract class Shape {

    //State - knows
    public String color;
    public double side;

    public Shape(String someColor){
        this.color =  someColor;
    }

    // Methods - can do
    public double calculateArea () {
        System.out.println("The area a of a shape is coming soon");
        return 0.0;
    }


}