package testcode;

/**
 * 고려해야할 점
 * - 문자열을 배열 형태로 쪼갤 수 있는가?
 *   방법 1. 배열로 나누기
 *   - 문자열 배열 / 문자 배열
 * - 주어진 조건에 따른 계산을 이뤄낼 수 있는가.
 *
 * - 다양한 방식에 대한 고찰
 */
public class Test27 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";

        String[] charArr = control.split("");

        for (String str: charArr) {

            if(str.equals("w")) {
                n += 1;
            } else if (str.equals("s")) {
                n -= 1;
            } else if (str.equals("d")) {
                n += 10;
            } else if (str.equals("a")) {
                n -= 10;
            }
        }

        int answer = n;

        System.out.println("answer = " + answer);
    }
}
