package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. 스캐너 클래스 이해
 * 2. 변수 선언 및 초기화
 * 3. 산술 연산과 문자열 연결
 * 4. 자바 구문 출력방식의 다향성 (System.out.println, System.out.printf)
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        //1. println
        System.out.println(a + " + " + b + " = " + sum);

        //2. print
        System.out.printf("%d + %d = %d", a, b, sum);

        //3. String format
        String format = String.format("%d + %d = %d", a, b, sum);
        System.out.println(format);
    }
}
