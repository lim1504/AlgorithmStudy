package testcode;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1. queries[0] ~ queries[1] 사이의 arr 인덱스를 참조하여, queries[2]가 arr[i] 값의 배수라면 + 1하여 arr[i] 데이터 변경
 *
 * stream 활용할 순 없을까?
 *
 */
public class Test31_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};

        // IntStream 에서 forEach는 실행 순서를 보장하지 않음
        // 두 방식에 어떤 차이가 있는 걸까?

//        for (int[] query : queries) {
//            Arrays.stream(arr, query[0], query[1]).forEach(i -> {
//                arr[i] = i % query[2] == 0 ? arr[i] + 1 : arr[i];
//                System.out.println(" = " + Arrays.toString(arr));
//            });
//        }

        for (int[] query : queries) {
            IntStream.rangeClosed(query[0], query[1])
                    .forEach(i -> {
                        arr[i] = i % query[2] == 0 ? arr[i] + 1 : arr[i];
                    });
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
