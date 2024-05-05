package try_catch;

public class TryCatchExample03 {
    public static void main(String[] args) {
        TryCatchExample03 uncaughtException = new TryCatchExample03();
        String name = null;
        uncaughtException.method1(name);
        System.out.println("main");
    }

    public void method1(String name) {
        System.out.println("method1");
        try {
            method2(name);
        }catch(NullPointerException e) {
            System.out.println("NullPointerException Catch!");
        }
        System.out.println("method1 work!");
    }

    public void method2(String name) {
        System.out.println("method2");

        try{
            method3(name);
        }catch (Exception e) {
            System.out.println("yakaladım method2");
        }

        System.out.println("method2 not work!");
    }

    public void method3(String name) {
        name.toLowerCase();
        System.out.println("method3 not work!");
    }

}
