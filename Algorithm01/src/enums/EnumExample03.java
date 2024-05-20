package enums;


public class EnumExample03 {

    public static void main(String[] args) {
        EnumExample03 main = new EnumExample03();
        main.comparison(1);
    }

    public void comparison(int value) {
        for (Employee emp : Employee.values()) {
            if (value == emp.getKey()) {
                System.out.println("Gelen degeri : " + value + " olan kisi : " + emp.name());
            }
        }
    }
}