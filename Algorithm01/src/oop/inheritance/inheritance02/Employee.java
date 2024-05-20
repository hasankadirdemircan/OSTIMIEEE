package oop.inheritance.inheritance02;

public class Employee extends A{

    private String name;
    private String address;

   protected void sayHello() {
       System.out.println("hello");
   }

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
