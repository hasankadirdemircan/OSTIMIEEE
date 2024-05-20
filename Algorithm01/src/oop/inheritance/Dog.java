package oop.inheritance;

public class Dog extends Animal {

    public void barking() {
        System.out.println("barking now");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
        super.eat();
    }
}
