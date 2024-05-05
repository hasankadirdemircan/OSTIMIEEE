package access_modifiers;

public class AccessModifiersExample03 {

    static void sayHello3() {
        System.out.println("Hello- Welcome3");
    }

    public void testSayHello3() {
        sayHello3();
    }

    public void testSayHello4(){
        AccessModifiersExample01.sayHello2();
    }
}
