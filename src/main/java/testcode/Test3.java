package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. 문자열을 합치는 것이 조건.
 * 2. repeat 활용하면 됨.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        String result = "";
        int i = 0;
        //1. old
//        for (int i = 0; i < n; i++) {
//            result += str;
//        }

        //2. new
        result += str.repeat(n);


        System.out.println(result);
    }
}
