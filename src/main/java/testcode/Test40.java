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
public class Test40 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2,3}, {0,7}, {5, 9}, {6, 10}};
        String answer = "";
        String[] str = my_string.split("");
        int[] arr;

        for (int i = 0; i < queries.length; i++) {
            arr = queries[i];
            List<String> charList = Arrays.asList(my_string.substring(arr[0], arr[1] + 1).split(""));
            Collections.reverse(charList);

            int idx = 0;
            for (int j = arr[0]; j <= arr[1]; j++) {
                str[j] = charList.get(idx++);
            }
            my_string = String.join("", str);
        }

        System.out.println("answer = " + my_string);
    }
}
