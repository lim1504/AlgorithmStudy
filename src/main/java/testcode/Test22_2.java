package testcode;

import java.util.stream.IntStream;

/**
 * 1. 등차수열 공식을 활용할 수 있는지에 대한 문제.
 * 2. Stream을 활용한 것
 */
public class Test22_2 {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        int answer = 0;
        boolean[] included = {true, false, false, true, true};

        //등차수열 공식 활용.
        for (int i = 0; i < included.length; i++) {
            if (included[i]) answer += a + (d * i);
        }

        //IntStream 활용.
        answer = 0;
        answer = IntStream.range(0, included.length)
                .map(idx -> included[idx] ? a + (d * idx) : 0)
                .sum();
    }
}
