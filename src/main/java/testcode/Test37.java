package testcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. 4 / 0 네 숫자가 같은 경우 => 1111 x p
 * 2. 3 / 1 한 숫자만 다른 경우 => (10 * p + q) * (10 * p + q)
 * 3. 2 / 2 2 개씩 같은 경우 => (p + q) * |p - q|
 * 4. 2 / 1 / 1 2개만 같고 나머지가 다 다른 경우 => q * r
 * 5. 1 / 1 / 1 / 1 다 다른 경우, 가장 작은 수
 *
 * - Array 를 활용한 규칙 생성
 * - List 및 Array 조합
 * - map을 활용한 조합 등..
 */
public class Test37 {
    public static void main(String[] args) {
        int a = 1, b = 4, c = 4, d = 4;
        int answer = 0;

        List<Integer> list = Arrays.asList(a, b, c, d);
        List<Integer> cnt = list.stream().map(i -> Collections.frequency(list, i)).collect(Collectors.toList());

        switch (Collections.max(cnt)) {

            case 4 : // 4개가 모두 같은 경우
                answer = 1111 * a;
            case 3 : // 3개만 같은 경우
                // indexof 는 해당 리스트에서 찾고자하는 object 정보의 가장 첫번째 index 를 가져옴.
                // Returns the index of the first occurrence of the specified element in this list
                int p = list.get(cnt.indexOf(3));
                int q = list.get(cnt.indexOf(1));
                answer = (int) Math.pow(10 * p + q, 2);
            case 2 : // 2개가 같은경우.
                if (Collections.min(cnt) == 2) {
                    //2개 / 2개 씩
                    int num = (a + c) * Math.abs(a - c);

                    answer = num == 0 ? (a + b) * Math.abs(a - b) : num;
                } else {
                    //2개 / 1개 / 1개 씩
                    int pp = list.get(cnt.indexOf(2));
                    answer = (a * b * c * d) / pp * pp;
                }
            default :
                answer = Collections.min(list);
        }
        System.out.println("answer = " + answer);
    }
}
