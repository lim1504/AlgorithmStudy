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
public class Test27_1 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        int answer = 0;

        String[] charArr = control.split("");

        //문자 비교, 문자열 비교 차이
        //for 문 내부 if, for문 내부 switch 성능차이?
        for (String str: charArr) {

            answer = str.equals("w") ? n += 1
                    : str.equals("s") ? n -= 1
                    : str.equals("d") ? n += 10
                    : str.equals("a") ? n -= 10
                    : 0;
        }

        char[] charArr2 = control.toCharArray();
        answer = 0;
        for (char chr: charArr2) {
            answer += chr == 'w' ? 1 : chr == 's' ? -1 : chr == 'd' ? 10 : -10;
        }

        System.out.println("answer = " + answer);
    }
}
