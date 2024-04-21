public class LogicalException03 {
    public static void main(String[] args) {
        String style = "Bold";
        String style2 = "Bold";
        String style3 = new String("Bold");

        if(style == style2)  {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if(style.equals(style3))  {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
