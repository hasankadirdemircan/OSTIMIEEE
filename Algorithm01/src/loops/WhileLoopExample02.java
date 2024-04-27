package loops;

public class WhileLoopExample02 {
    public static void main(String[] args) {
        int start=0;
        while(true){
            System.out.println("Start Değişkenimiz: "+start);
            start++;
            if(start > 5){
                break;
            }
        }

    }
}
/*
0123456
01234       X
012345
sonsuz döngü X
67 ...
 */