package access_modifiers_02;

import access_modifiers.AccessModifiersExample03;

public class AccessModifiersExample02 {

    protected static void sayHello() {
        System.out.println("Hello- Welcome");
    }
    public static void sayHello2() {
        System.out.println("Hello- Welcome2");
    }

    public void test() {
      //  AccessModifiersExample03.sayHello3();'sayHello3()' is not public in 'access_modifiers.AccessModifiersExample03'. Cannot be accessed from outside package
        AccessModifiersExample05 access = new AccessModifiersExample05();
        access.sayHello6();
    }


}
