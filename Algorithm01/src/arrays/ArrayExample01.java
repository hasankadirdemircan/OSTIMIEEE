package arrays;

public class ArrayExample01 {
    public static void main(String[] args) {
        String[] nameArray = new String[6];
        nameArray[0] = "ahmet";
        nameArray[1] = "ayşe";
        nameArray[2] = "mehmet";
        nameArray[3] = "fatma";
        nameArray[4] = "ali";
        nameArray[5] = "merve";

        String[] nameArray2 = {"ahmet", "ayşe", "mehmet", "fatma"};

        String name = nameArray2[2];
        System.out.println(nameArray[2]);
        System.out.println(name);

        System.out.println("foreach-----");
        for(String variable : nameArray) {
            System.out.println(variable);
        }

        System.out.println("for------");
        for(int i=0; i<nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
    }
}
