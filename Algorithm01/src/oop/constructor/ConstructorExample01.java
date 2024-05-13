package oop.constructor;

public class ConstructorExample01 {

    private String name;
    ConstructorExample01() {
        System.out.println("constructor - ConstructorExample01");
    }

    ConstructorExample01(String name) {
        System.out.println("constructor name param");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
