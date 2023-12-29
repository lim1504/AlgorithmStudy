package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 고려해야할 점
 * 1. 무조건 0 혹은 5만 포함하고 있는 정보 추출
 * 2. 숫자 비교만으로는 0 혹은 5가 포함되어있는지 파악 어렵다.
 * 3. 문자비교를 통해 0과 5가 포함되어있는지 체크
 *
 */
public class Test32 {
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 5 != 0) continue;
            String str = i + "";
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0' || str.charAt(j) == '5') {
                    cnt ++;
                }
            }
            if (str.length() == cnt) {
                list.add(i);
            }
        }

        int[] answer = list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(Integer::valueOf).toArray();

        System.out.println("answer = " + Arrays.toString(answer));
    }
}
