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
 * 1. min 범위에 있는 숫자 List에 담아, sorted 후, 첫번째 값만 뽑기
 */
public class Test30 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        //queries.length => 행의 개수 / queries[0].length => 한 행에 속해있는 정보 개수
        //문제는 행만큼 연산을 수행하여 값을 도출하는 문제 따라서, queries.length이 적합
        int[] answer = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int min_range = query[0];
            int max_range = query[1];
            int min = query[2];

            List<Integer> list = new ArrayList<>();
            for (int i = min_range; i <= max_range; i++) {
                if (arr[i] > min) {
                    list.add(arr[i]);
                }
            }

            if (!list.isEmpty()) {
                Collections.sort(list);
                answer[idx] = list.get(0);
            }
            else {
                answer[idx] = -1;
            }

            idx++;
        }
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
