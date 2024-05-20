package wrapper;

public class WrapperExample02 {
    public static void main(String[] args) {
        // valueof methodu
        Integer integer1 = Integer.valueOf("50");//String --> Wrapper
        System.out.println(integer1);

        //	Integer integer2 = Integer.valueOf("50.3");// RunTimeExceptin Error: java.lang.NumberFormatException: For input string: "50.3"


        Boolean boolean1 = Boolean.valueOf("falsE");
        Boolean boolean2 = Boolean.valueOf(true);
        Boolean boolean3 = Boolean.valueOf("TruE");

        Float float1 = Float.valueOf("4.4"); //String -> wrapper
        System.out.println(float1);

        //xxxValue
        Integer integer2 = new Integer(150);
        int int1 = integer2.shortValue(); //wrapper -> primitive
        byte byte1 = integer2.byteValue();

        //parsexxx
        int int2 = Integer.parseInt("120"); // string -> primitive

    }
}
