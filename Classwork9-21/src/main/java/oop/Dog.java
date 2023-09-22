package oop;

public class Dog extends Canine implements IPet {
    // Is A relationship - Inheritance
    private String greet;
    public Dog(String food) {
        super(food);
    }

    @Override
    public void printAnimalFood(String message) {
        System.out.println("Dogs eat" + food  + " and the greet you by " + greet + " and message ->" + message);
    }

    @Override
    public void greetOwner() {
        System.out.println("Jumps and licks you and wags its tail!!! ");

    }
}
