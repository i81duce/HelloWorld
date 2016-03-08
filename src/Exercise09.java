import java.util.ArrayList;
import java.util.Collections;

public class Exercise09 { //                         REVERSING AN INT
    public static void main(String[] args) {
        int num = 12345;

        useReverse(num);
        useMath(num);

//        String numStr = String .valueOf(num);
//        StringBuffer buff = new StringBuffer(numStr);
//        numStr = buff.reverse().toString();
//        int newNum = Integer.valueOf(numStr);
//        System.out.println(newNum);
    }

    public static void useReverse(int num) {
        String numStr = String.valueOf(num);
        numStr = new StringBuilder(numStr).reverse().toString();
        int newNum = Integer.valueOf(numStr);
        System.out.println(newNum);
    }

    public static void useMath(int num) {
        int newNum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            newNum = newNum * 10 + rem;
            System.out.println(newNum);
        }
    }
}
