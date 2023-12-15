package testcode;

import java.util.stream.IntStream;

/**
 * 고려해야할 점
 * 1. 홀수의 합 & 짝수의 합을 구하기
 * 2. 홀수 & 짝수 합 구하는 공식을 알고 있어야한다.
 * 3. IntStream을 활용한 방식
 * 4. 단순 for - if 문 활용.
 */
public class Test18 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        boolean numBool = n % 2 == 0 ? true : false;

        //1. IntStream 활용
        if (numBool) {
            answer = IntStream.rangeClosed(1, n).filter(i -> i%2 == 0).map(i -> (int) Math.pow(i, 2)).sum();

        } else {
            answer = IntStream.rangeClosed(1, n).filter(i -> i%2 == 1).sum();
        }

        //2. 단순 for - if 활용
        answer = 0;
        for (int i = 1; i <= n; i++) {
            //1, 3, 5, 7 , 9
            if(n % 2 == 0 && i % 2 == 0) { //2, 4, 6, 8, 10
                answer += i * i; // 2, 4, 16 36 64 100
            }
            else if(n % 2 == 1 && i % 2 == 1) {
                answer += i;
            }
        }

        System.out.println(answer);
    }
}
