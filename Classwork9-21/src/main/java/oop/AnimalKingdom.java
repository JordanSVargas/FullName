package oop;

public class AnimalKingdom {
    public static void main(String[] args) {

        Cat cat = new Cat("Fish");
        cat.printAnimalFood("This is a cat and they eat ");
        Dog dog = new Dog("Bones");
        System.out.println("This is a dog and they eat");

        RoboDog roboDog = new RoboDog();
        //An array of pet objects
        Lion lion  = new Lion("people");

        IPet[] pets = {cat, dog, roboDog};

        //for loop
        for (int i = 0; i < pets.length; i++){
            pets[i].greetOwner();
        }

        //for each loop or enhanced loop
        for (IPet p : pets){
            p.greetOwner();
        }

        }
}
