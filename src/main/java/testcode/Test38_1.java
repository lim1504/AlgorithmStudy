package testcode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 1. int 배열에 맞는 스펠링 정보를 조합.
 * 2. 스트림 활용
 */
public class Test38_1 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        String answer = Arrays.stream(index_list).mapToObj(i -> String.valueOf(my_string.charAt(i))).collect(Collectors.joining());

        System.out.println("answer = " + answer);
    }
}
