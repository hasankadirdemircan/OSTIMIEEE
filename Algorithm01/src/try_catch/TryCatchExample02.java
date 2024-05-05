package try_catch;

public class TryCatchExample02 {
    public static void main(String[] args) {
        try {
            String name = null;
            name = name.toUpperCase();
            System.out.println("try!");
        }catch(NullPointerException e) {
            System.out.println("NullPointerException!!");
        }finally {
            System.out.println("finally!");
        }
    }
}
