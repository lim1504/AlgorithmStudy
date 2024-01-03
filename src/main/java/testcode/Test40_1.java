package testcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 문자열에서 2차원 배열의 인덱스 정보를 순차적으로 뒤집어라.
 *
 * - 반복, 배열의 정보를 활용.
 *
 */
public class Test40_1 {
    static char[] arr;
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2,3}, {0,7}, {5, 9}, {6, 10}};
        String answer = "";

        arr = my_string.toCharArray();

        for (int[] query : queries) {

            reverse(query[0], query[1]);

        }

        System.out.println("answer = " + my_string);
    }

    private static void reverse(int s, int e) {

        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }


}
