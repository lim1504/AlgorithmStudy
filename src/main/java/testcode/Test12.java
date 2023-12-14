package testcode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 고려해야할 점
 * 1. StringArray to String 에 대한 기능
 * 2. 문자열을 합치는 기능 활용 (for, join, stream)
 */
public class Test12 {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "c", "d", "e"};
        String answer = "";

        for (String str : arr) {
            answer += str;
        }

        System.out.println(answer);

        //1. Join 활용
        answer = String.join("", arr);
        System.out.println(answer);

        //2. Stream 활용
        //프로그래머스에서 stream 객체정보는 오류. why?
        answer = Arrays.stream(arr).collect(Collectors.joining());
        System.out.println(answer);
    }
}
