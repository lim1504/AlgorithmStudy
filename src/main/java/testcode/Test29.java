package testcode;

import java.util.Arrays;

/**
 * 고려해야할 점
 * 1. 2차원 배열을 1차원 배열 변환
 * 2. arr 배열 데이터를 옮기기 위한 작업
 *
 * - 배열 및 변수를 이용한 이동
 * - stream
 */
public class Test29 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        int temp = 0;

        for (int[] query : queries) {
            //서로 교환할 인덱스 정보
            int i = query[0];
            int j = query[1];

            //실제 교환 과정
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("arr2 = " + Arrays.toString(arr));

        int[] arr2 = {0, 1, 2, 3, 4};
        for (int[] query : queries) {
            //서로 교환할 값
            int i = arr2[query[0]];
            int j = arr2[query[1]];

            //실제 교환 과정
            arr2[query[0]] = j;
            arr2[query[1]] = i;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
