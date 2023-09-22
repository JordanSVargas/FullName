package oop;

public abstract class Animal {

    protected String food;

    public Animal(String food){
        this.food = food;
    }

    //Overloading

    public abstract void printAnimalFood(String message); // signatiure

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                '}';
    }

    //    public String getFood() {
//        return food;
//    }
//
//    public void setFood(String food) {
//        this.food = food;
//    }
}
