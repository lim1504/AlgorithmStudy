package testcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 배열로 푸는 방법
 * 주사위 숫자는 크기가 다르지만, 최소 2개 이상이 같은 경우의 수를 체크 할 것
 * 4, 3, 2, 1 => 2개인 경우에 2 / 2개 씩 같은지, 2 / 1 / 1 같은지에 대한 체크가 중점
 * 2 / 2 세트인 경우 |p - q| 주목할 것 (둘중 큰 수가 좌측 기준 점)
 */
public class Test37_1 {
    public static void main(String[] args) {
        int a = 6, b = 3, c = 3, d = 6;
        int answer = 0;

        int [] number = new int[] {a, b, c, d};
        Arrays.sort(number);

        if(number[0] == number[3]) {
            //4 개가 같은경우
            answer = 1111 * number[0];
        } else if (number[0] == number[2] || number[1] == number[3]) {
            //3 개만 같은 경우
            //제일 큰수 + 제일 작은수 - 큰수 => 숫자간 차이
            answer = (int) Math.pow(10 * number[1] + (number[0] + number[3] - number[1]), 2);
        } else if (number[0] == number[1] && number[2] == number[3]) {
            //2개만 같은 경우 (2개 & 2개 씩 같은 경우)
            answer = (number[0] + number[3]) * (number[3] - number[0]);
        } else if (number[0] == number[1]) {
            //아래 else if 조건은 모두 2개 & 1개 & 1개가 같은 경우
            answer = number[2] * number[3];
        } else if (number[1] == number[2]) {
            answer = number[0] * number[3];
        } else if (number[2] == number[3]) {
            answer = number[0] * number[1];
        } else {
            //모두 다른 경우
            answer = number[0];
        }

        System.out.println("answer = " + answer);
    }
}
