package testcode;

import java.util.Arrays;

/**
 * Arrays.stream 활용한 연산
 * Math.pow
 * reduce => 스트림에 담긴 요소를 하나의 데이터로 만듬.
 * Integer::sum 을 활용한 메소드참조
 */
public class Test24_2 {
    public static void main(String[] args) {
        int answer = 0;
        int[] num_list = {5, 7, 8, 3};

        int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        int multiply = Arrays.stream(num_list).reduce((a,b) -> a * b).getAsInt();

        answer = Math.pow(sum, 2) > multiply ? 1 : 0;
        System.out.println("answer = " + answer);
    }
}
