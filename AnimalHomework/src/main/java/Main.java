public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Scooby-Doo";
        dog.age = 40;
        dog.isDomesticated = true;
        dog.sound = "Bark! Bark!";
        dog.idNumbers = new double [] {100, 77, 1};

        dog.printAnimalSound();
        dog.printAnimaId();

        Animal bear = new Animal();
        bear.name = "Polo Bear";
        bear.age = 50;
        bear.isDomesticated = false;
        bear.sound = "Rawr! Rawr!";
        bear.idNumbers = new double[] {10, 29, 101};

        bear.printAnimalSound();
        bear.printAnimaId();

        Animal cat = new Animal();
        cat.name = "Mocha";
        cat.age = 2;
        cat.isDomesticated = true;
        cat.sound  = "meow.. meow..";
        cat.idNumbers = new double[] {11, 2};

        cat.printAnimalSound();
        cat.printAnimaId();







    }
}
