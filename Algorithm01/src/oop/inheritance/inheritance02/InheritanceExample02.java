package oop.inheritance.inheritance02;

public class InheritanceExample02 {
    public static void main(String[] args) {
        Person person = new Person("hasan", "ankara", true);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person.isPremium());

        person.sayHello();
        person.shutDown();
    }
}
