package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. 문자열 연결에 대한 개념
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //1. 단순 연결
        System.out.println(a + b);

        //2. concat
        String result = a.concat(b);
        System.out.println(result);

    }
}
