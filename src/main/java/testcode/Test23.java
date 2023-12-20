package testcode;

/**
 * - 숫자 3개
 * - 모두 같음, 2개만 같음, 모두 같음
 * - 숫자 3개를 비교 & 연산 공식
 */
public class Test23 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;
        int answer = 0;
        if (a == b && b == c) {
            //Math.pow
            answer = (a + b + c) * ((a*a) + (b*b) + (c*b)) * ((a*a*a) + (b*b*b) + (c*c*c));
        } else if (a == b || b == c || a == c) {
            answer = (a + b + c) * ((a*a) + (b*b) + (c*c));
        } else {
            answer = (a + b+ c);
        }

        System.out.println("answer = " + answer);
    }
}
