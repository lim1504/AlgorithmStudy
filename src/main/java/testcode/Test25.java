package testcode;

/**
 * 문자열 & 숫자의 합을 구할 수 있는지 묻는 문제
 * 1. 홀수 짝수의 조건 작성할 수 있나?
 * 2. 문자열과 숫자의 형변환을 유연하게 다룰 수 있는가?
 *
 * - 단순 비교 및 합 구하기
 * - stream 활용
 */
public class Test25 {
    public static void main(String[] args) {
        int answer = 0;
        int[] num_list = {5,7,8,3};

        String odd = "";
        String even = "";
        for (int i : num_list) {

            if (i % 2 == 1) {
                odd += "" + i;
            }
            else {
                even += "" + i;
            }
        }

        answer = Integer.parseInt(odd) + Integer.parseInt(even);

        System.out.println("answer = " + answer);
    }
}
