package testcode;

/**
 * 고려해야할 점
 * 1. 문자열 합치기와 비슷한 문제라는 것
 * 2. 문자열을 합칠때 필요한 기능을 알고 있는가?
 *
 */
public class Test13 {
    public static void main(String[] args) {
        String my_string = "asdasd";
        int k = 5;

        String answer = "";
        answer = my_string.repeat(k);

        System.out.println(answer);
    }
}
