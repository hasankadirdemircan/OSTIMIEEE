package oop.inheritance;

public class InheritanceExample01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.setName("karabas");
        System.out.println(dog.getName());
        dog.barking();
    }
}
