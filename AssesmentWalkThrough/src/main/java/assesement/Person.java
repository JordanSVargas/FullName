package assesement;

import java.util.Arrays;

public abstract class Person {
    private String name;
    private Size size;
    private Clothing[] clothingitems;
    public Person(String name){
        this.name = name;
    }
    public Person(String name, Size size, Clothing[] clothingitems) {
        this.name = name;
        this.size = size;
        this.clothingitems = clothingitems;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public Clothing[] getClothingitems() {
        return clothingitems;
    }
    public void setClothingitems(Clothing[] clothingitems) {
        this.clothingitems = clothingitems;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", clothingitems=" + Arrays.toString(clothingitems) +
                '}';
    }
}