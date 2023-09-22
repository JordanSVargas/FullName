package oop;

public class Lion extends Feline{
    public Lion(String food) {
        super(food);
    }

    public Lion(String food, int age) {
        super(food, age);
    }

    @Override
    public void printAnimalFood(String message) {
        System.out.println("Lions eat " +food+ " : " + message);
    }
}
