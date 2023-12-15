package testcode;

/**
 * 고려해야할 점
 * 1. 숫자 연산에 관한 문제
 * 2. 나누기, 나머지에 관한 개념
 * 3. 비교방법에 대한 지식 필요
 *  - For
 *  - 3항 연산자
 */
public class Test16 {
    public static void main(String[] args) {
        int num = 98;
        int n = 3;

        int answer = 0;

        answer = num % n == 0 ? 1 : 0;
    }
}
