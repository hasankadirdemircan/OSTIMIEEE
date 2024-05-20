package enums;

import com.sun.org.apache.xpath.internal.operations.Or;

public class EnumExample01 {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(Size.SMALL);
        orderPizza.orderPizza();
        System.out.println(orderPizza.pizzaSize);
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.LARGE.toString().toLowerCase());

       // System.out.println(Size.valueOf("Large"));Exception in thread "main" java.lang.IllegalArgumentException: No enum constant enums.Size.Large
        System.out.println(Size.valueOf("LARGE"));

        Size[] sizeValues = Size.values();

        System.out.println("before for");
        System.out.println(sizeValues.toString());
        System.out.println("for--");
        for(Size size: sizeValues) {
            System.out.println(size.name());
        }

    }
}
