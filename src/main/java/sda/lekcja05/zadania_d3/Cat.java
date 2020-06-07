package sda.lekcja05.zadania_d3;

public class Cat extends Animal {
    private int mouse;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " miau!");
    }

    public void eatMouse() {
        mouse++;
        System.out.println("Zjadłem " + mouse + " myszy.");

    }
}
