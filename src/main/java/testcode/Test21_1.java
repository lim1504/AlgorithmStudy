package testcode;

import java.util.Objects;

/**
 * 1. mode는 0, 1 둘중 하나
 * 2. mode가 0 (짝수), mode 1 (홀수) 인 경우만 문자열 추가
 * 3. mode가 짝&홀과 관계없이 idx의 문자가 '1' 인 경우 mode만 변경.
 * 4. 빈 문자열인 경우 "EMPTY" 출력
 */
public class Test21_1 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String answer = "";
        String ret = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if(ch == '1') mode = mode == 0 ? 1 : 0;
            else if (mode == 0 && i % 2 == 0) ret += code.charAt(i);
            else if (mode == 1 && i % 2 == 1) ret += code.charAt(i);
        }

        answer = ret.isEmpty() ? "EMPTY" : ret;

        System.out.println("answer = " + answer);
    }
}
