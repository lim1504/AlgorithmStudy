package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. 연산자에 대한 이해도 필요.
 */
public class Test9 {
    final static String EVEN = " is even";
    final static String ODD = " is odd";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println(n + EVEN);
        } else {
            System.out.println(n + ODD);
        }

        //3항 연산
        System.out.println(n + "is " + (n % 2 == 0 ? "even" : "odd"));
    }
}
