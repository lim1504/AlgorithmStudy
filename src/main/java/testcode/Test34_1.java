package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 콜라츠 수열에 대한 문제
 * 자연수 x = 10이 주어졌을때, 짝수인 경우 x / 2, 홀수인 경우 3 * x + 1 과정을 거쳐 x가 1이 될때 까지 연산 수행
 * - for 문을 활용한 List 객체 활용.
 * - stream 활용 (Stream - IntStream 간 차이)
 */
public class Test34_1 {
    public static void main(String[] args) {
        int n = 10;
        //Stream
        int[] answer = Stream.iterate(
                n, 
                i -> i >= 1, 
                i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : (3 * i) + 1
        ).mapToInt(Integer::intValue).toArray();

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        
        //IntStream
        int[] answer2 = IntStream.iterate(
                n,
                i -> i >= 1,
                i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : (3 * i) + 1
                ).toArray();
        System.out.println("Arrays.toString(answer2) = " + Arrays.toString(answer2));
    }
}
