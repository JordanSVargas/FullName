package dayTwo;



public class ShapeFactory {
    public static void main(String[] args) {
        //instantiate objects
        Rectangle rectangle = new Rectangle("Green", 20.0, 10.0);
        double answerForRectangle  =   rectangle.calculateArea(); //200.0
        System.out.println(answerForRectangle);


        Circle circle = new Circle("yellow", 40.0);
        double returnedValueFromMethodCall =  circle.calculateArea(); // 125.6
        System.out.println(returnedValueFromMethodCall);

//        Shape rectangle = new Shape();
//        rectangle.width = 20.0; // objectName.propertyName
//        System.out.println(rectangle.color);
//        System.out.println(rectangle.width);
//        //L * W - Area of a rectangle
//        rectangle.calculateArea();
//
//        Shape circle = new Shape("green");
//        System.out.println(circle.color);
//        circle.calculateArea();

        //objectName.methodName
        //PI * R * R - Area of a circle


        //invoke methods
    }
}
