package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. Scanner에 대한 지식 필요
 *  - 스케너는 콘솔 입력사항을 그대로 출력하는 기능을 할 수 있다.
 *  - next, nextLine 에 대한 기초적인 이해도가 필요하다.

 * 2. 빈문자열 입력 대체 및 제한사항
 *
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if(1<= a.length() && a.length() <= 1000000) {
            System.out.println(a.replaceAll(" ", ""));
        }

    }
}
