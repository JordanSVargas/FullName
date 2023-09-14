public class Animal {

    public String name;
    public int age;
    public String sound;
    public boolean isDomesticated;
    public double idNumbers [];

    public void printAnimalSound(){
        System.out.println(sound);
    }

    public void printAnimaId(){
        for(int i = 0; i <idNumbers.length; i++){
            System.out.println(idNumbers[i]);
        }

    }
}
