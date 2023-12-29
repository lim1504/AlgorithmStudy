package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 콜라츠 수열에 대한 문제
 * 자연수 x = 10이 주어졌을때, 짝수인 경우 x / 2, 홀수인 경우 3 * x + 1 과정을 거쳐 x가 1이 될때 까지 연산 수행
 * - for 문을 활용한 List 객체 활용.
 * - stream 활용
 */
public class Test34 {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        for (int i = 0; i < n; i++) {
            int x = 0;
            int temp = list.get(i);
            x = temp % 2 == 0 ? temp / 2 : (3 * temp) + 1;

            list.add(x);
            if (x <= 1) break;
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("list = " + Arrays.toString(answer));
    }
}
