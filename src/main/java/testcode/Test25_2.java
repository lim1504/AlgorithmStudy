package testcode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * stream 활용
 * - filter 활용하여 홀짝 구분
 * - mapToObj 활용 String::valueOf 활용해 String 객체로 변환하여 합침
 * - Collectors.joining 활용하여 문자열 합침. (위 단계가 선행되어야 사용가능)
 */
public class Test25_2 {
    public static void main(String[] args) {
        int answer = 0;
        int[] num_list = {5,7,8,3};

        int odd = Integer.parseInt(Arrays.stream(num_list).filter(i -> i % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining()));
        int even = Integer.parseInt(Arrays.stream(num_list).filter(i -> i % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining()));

        answer = odd + even;
    }
}
