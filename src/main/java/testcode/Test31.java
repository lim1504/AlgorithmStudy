package testcode;

import java.util.Arrays;

/**
 * 1. queries[0] ~ queries[1] 사이의 arr 인덱스를 참조하여, queries[2]가 arr[i] 값의 배수라면 + 1하여 arr[i] 데이터 변경
 *
 *
 */
public class Test31 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] = arr[i] + 1;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
