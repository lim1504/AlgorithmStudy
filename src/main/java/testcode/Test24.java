package testcode;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1. 원소들의 곱 / 원소들의 합의 제곱간 비교
 * - Math.pow 활용
 * - Arrays.stream 활용 방법
 *
 */
public class Test24 {
    public static void main(String[] args) {
        int answer = 0;
        int[] num_list = {5, 7, 8, 3};

        int num = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        int num2 = (int) Math.pow(Arrays.stream(num_list).reduce(0, (a, b) -> a + b), 2);

        answer = num > num2 ? 0: 1;

        System.out.println("answer = " + answer);
    }
}
