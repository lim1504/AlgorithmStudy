package testcode;

import java.util.Arrays;

/**
 * 1. int 배열에 맞는 스펠링 정보를 조합.
 * - 문제파악 이슈
 * 1. 정렬 혹은 중복제거에 대한 내용이 없음.
 * 2. 단순히 문자열에 속한 정보와 매칭시키는 것. 어렵게 생각함.
 */
public class Test38 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

        String answer = "";
        
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }

        System.out.println("answer = " + answer);
    }
}
