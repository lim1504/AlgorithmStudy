package testcode;

/**
 * 고려해야할 점
 * - chars() 문자열을 아스키 코드 값으로 출력
 * - reduce(init, IntBinaryOperator)형태 (result , element) 연산
 */
public class Test27_2 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        int answer = control.chars().reduce(n, (a, b) -> a + (b == 'w' ? 1 : b == 's' ? -1 : b == 'd' ? 10 : -10));

        System.out.println("answer = " + answer);
    }
}
