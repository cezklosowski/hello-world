package sda.lekcja05.zadania_d3;

public class Dog extends Canidae {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " hau!");
    }


}
