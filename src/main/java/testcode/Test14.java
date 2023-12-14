package testcode;

/**
 * 고려해야할 점
 * 1. 숫자형과 문자형의 성질을 알고 있나?
 * 2. 숫자를 문자열과 같이 합치는 방법을 알고 있나? (String.valueOf, Integer.parseInt 등..)
 */
public class Test14 {
    public static void main(String[] args) {
        int answer = 0;
        int a = 9;
        int b = 81;

        //1. String.valueOf, Integer.parseInt 를 활용.
        String a_str = String.valueOf(a);
        String b_str = String.valueOf(b);

        String sum_str1 = a_str + b_str;
        String sum_str2 = b_str + a_str;

        int sumInt1 = Integer.parseInt(sum_str1);
        int sumInt2 = Integer.parseInt(sum_str2);

        answer = sumInt1 > sumInt2 ? sumInt1 : sumInt2;

        //2. 다양한 방식을 활용 문자열 + Int 활용
        int conInt1 = Integer.parseInt("" + a + b);
        int conInt2 = Integer.parseInt("" + b + a);

        answer = conInt1 > conInt2 ? conInt1 : conInt2;
    }
}
