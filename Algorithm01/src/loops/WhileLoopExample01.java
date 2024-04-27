package loops;

public class WhileLoopExample01 {

    public static void main(String[] args) {
        int start=0,finish=5;
        while( finish >= 0 ){
            System.out.println("Start Değişkenimiz: "+start+"\tFinish Değişkenimiz: "+finish);
            start++;
            finish--;
        }

    }
}
/*
finish 5 4 3 2 1
start 0 1 2 3 4

finish 5 4 3 2 1 0
start 0 1 2 3 4

finish 5 4 3 2 1 0
start 0 1 2 3 4 5
 */