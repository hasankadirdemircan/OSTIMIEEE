package oop.inheritance;

public class Animal {

    private String name;

    public void eat() {
        System.out.println("I can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
