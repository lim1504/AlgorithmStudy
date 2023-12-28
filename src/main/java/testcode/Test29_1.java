package testcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 고려해야할 점
 * 1. 2차원 배열을 1차원 배열 변환
 * 2. arr 배열 데이터를 옮기기 위한 작업
 *
 * - 배열 및 변수를 이용한 이동
 * - stream
 */
public class Test29_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int[] query : queries) {

            Collections.swap(list, query[0], query[1]);
        }

        System.out.println("list = " + list);

    }
}
