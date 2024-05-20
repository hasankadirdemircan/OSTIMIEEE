package oop.encapsulation;

public class EncapsulationExample01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("hasan");
        person.setAge(29);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
