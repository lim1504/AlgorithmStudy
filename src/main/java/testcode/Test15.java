package testcode;

/**
 * 고려해야할 점
 * 1. 숫자를 문자열 형식으로 이어붙일 수 있나?
 * 2. 숫자 비교를 할 수 있나?
 * 3. 숫자 비교시 사용할 수 있는 Math.max 활용도 체크
 */
public class Test15 {
    public static void main(String[] args) {
        int answer = 0;
        int a = 12;
        int b = 3;

        int abSum = Integer.parseInt("" + a + b);
        int abMultiSum = 2 * a * b;

        answer = abSum >= abMultiSum ? abSum : abMultiSum;

        //1. Math.max 활용
        // a >= b ? a : b 구현하고 있음.
        answer = Math.max(abSum, abMultiSum);
    }
}
