package oop.inheritance.inheritance02;

public class Person extends Employee{

    private boolean premium;

    public Person(String name, String address, boolean isPremium) {
        super(name, address);
        this.premium = isPremium;
    }

    public boolean isPremium() {
        return premium;
    }
}
