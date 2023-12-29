package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 고려해야할 점
 * 1. 무조건 0 혹은 5만 포함하고 있는 정보 추출
 * 2. 숫자 비교만으로는 0 혹은 5가 포함되어있는지 파악 어렵다.
 * 3. 문자비교를 통해 0과 5가 포함되어있는지 체크
 *
 * - stream 활용
 */
public class Test32_1 {
    public static void main(String[] args) {
        int l = 10;
        int r = 20;

        int[] answer = IntStream.rangeClosed(l, r).filter(i -> {
            while (i > 0) {
                if (i % 5 != 0) return false;
                i /= 10;
            }
            return true;
        }).toArray();

        answer = answer.length == 0 ? new int[] {-1} : answer;

        System.out.println("answer = " + Arrays.toString(answer));
    }
}
