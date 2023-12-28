package testcode;

import java.util.stream.IntStream;

/**
 * 스트림 활용
 * - iterate 0부터 1씩 늘어나는 반복문을 실행
 * - limit 최대 사이즈는 num_list length 의 + 1 만큼
 * - map 을 활용해 해당 값이 마지막인 경우만 체크.
 *   -> 마지막일때 마지막 값과 마지막 - 1 값을 비교해 값 출력
 */
public class Test26_2 {
    public static void main(String[] args) {
        int[] num_list = {5,2,1,7,5};

        int[] answer = IntStream.iterate(0 , i -> i + 1)
                .limit(num_list.length + 1)
                .map(i -> i == num_list.length ?
                        (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] - num_list[i - 2] : num_list[i - 1] * 2)
                        : num_list[i]).toArray();
    }
}
