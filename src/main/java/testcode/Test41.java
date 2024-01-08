package testcode;

import java.util.Arrays;

/**
 * 1. index 시작위치 s
 * 2. 시작위치에서 몇 개 => l
 * 3. 주어진 숫자 > k
 *
 * 배열내부의 String을 규칙에 맞게 자를 수 있는지
 * String -> Integer 로 형변환을 할 수 있는지
 *
 * List, Stream 등의 방식을 사용할 수 있음.
 */
public class Test41 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        int[] answer = Arrays.stream(intStrs).mapToInt(i -> {
            return Integer.parseInt(i.substring(s, s+l));
        }).filter(i -> i > k).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
