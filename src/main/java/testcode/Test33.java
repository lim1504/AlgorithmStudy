package testcode;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * stream 을 활용한 나열
 * for 문으로 접근
 *
 */
public class Test33 {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        
        int[] answer = IntStream.rangeClosed(start_num, end_num).sorted().toArray();

        System.out.println("Arrays.toString(answer)); = " + Arrays.toString(answer));
    }
}
