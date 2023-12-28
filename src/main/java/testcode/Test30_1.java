package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * 고려해야할 점
 * 1. queries 의 0번째 index 를 query 로 지정한다.
 * 2. 각, query 의 1번, 2번은 범위이다.
 * 3. 2보다 큰 다음 index 의 값을 찾는다.
 *
 * - min 보다 큰숫자를 체크는 어렵지 않다, min보다 큰 숫자가 여러개인 경우가 문제
 * 1. Arrays.fill 활용
 * 2. Math.min 활용
 */
public class Test30_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2, 4}, {0, 3, 2}, {0, 2, 2}};

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        //queries.length / queries[0].length 차이
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        int idx = 0;
        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }
            idx++;
        }
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
