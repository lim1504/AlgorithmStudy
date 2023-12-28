package testcode;


/**
 * 고려해야할 점
 * 1. 배열이 가지는 규칙을 파악해야한다.
 * 2. index 0 -> 1 -> 2인 경우, 0 1 0으로 변하기 때문에 +1, -1 을 거치기 때문에 "w" "s"로 치환된다.
 *    [i-1] + [i]은 원하는 결과가 출력될 수 없다. [i+1] - [i] = x 이다.
 *
 * 3. for, switch 를 활용한 비교.
 * 4. stream을 활용한 비교.
 */
public class Test28 {
    public static void main(String[] args) {
        //"wsdawsdassw"
        int[] numlog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String answer = "";

        for (int i = 1; i < numlog.length; i++) {
            int num = numlog[i] - numlog[i - 1];
            if (num == 1) answer += "w";
            else if (num == -1) answer += "s";
            else if (num == 10) answer += "d";
            else if (num == -10) answer += "a";
        }

        System.out.println("answer = " + answer);
    }
}
