package access_modifiers;

import access_modifiers_02.AccessModifiersExample02;

public class AccessModifiersExample01 extends AccessModifiersExample02 {
    public static void main(String[] args) {
        AccessModifiersExample02.sayHello();
        AccessModifiersExample03.sayHello3();
        //className.methodName
        sayHello4();
        //AccessModifiersExample04.sayHello5(); -> 'sayHello5()' has private access in 'access_modifiers.AccessModifiersExample04'
    }

    private static void sayHello4() {
        System.out.println("hello-welcome4");
    }
}
