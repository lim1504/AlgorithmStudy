package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. 90도 회전 세로 출력에 관한 내용에 함몰되지 않는게 중요.
 * 2. 프로그래밍 언어로 세로출력을 할 수 있는 방법에 대한 접근이 필요
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        //문자열 charArray로 변환 후 출력
        for (char c : a.toCharArray()) {
            System.out.println(c);
        }

        //문자로 출력하는 charAt 활용
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }

        //스플릿을 활용한 문자열 자르기
        for(String s : a.split("")){
            System.out.println(s);
        }
    }
}
