package testcode;

import java.util.Arrays;
import java.util.stream.IntStream;


/**
 * 고려해야할 점
 * 1. queries 의 0번째 index 를 query 로 지정한다.
 * 2. 각, query 의 1번, 2번은 범위이다.
 * 3. 2보다 큰 다음 index 의 값을 찾는다.
 *
 * - min 보다 큰숫자를 체크는 어렵지 않다, min보다 큰 숫자가 여러개인 경우가 문제
 * 1. Stream
 */
public class Test30_3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        int[] answer = Arrays.stream(queries).mapToInt(
                q -> {
                    int min = Arrays.stream(arr, q[0], q[1] + 1).filter(n -> n > q[2]).min().orElse(-1);
                    return min;
                }
        ).toArray();

        int[] answer2 = IntStream.range(0, queries.length)
                        .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                                .map(i -> arr[i])
                                .filter(n -> n > queries[q][2])
                                .min()
                                .orElse(-1)
                        ).toArray();

        System.out.println("answer1 = " + Arrays.toString(answer));
        System.out.println("answer2 = " + Arrays.toString(answer2));
    }
}
