package testcode;

/**
 * mode = 0 짝수, mode = 1 홀수
 * 순서에 해당하는 숫자가 짝수든 홀수든 숫자면 건더뛰어
 * mode 가 0으로 시작할지 1로 시작할지 모름. mode는 동적으로 변경이 가능해야함.
 */

// 실패코드
public class Test21 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            boolean str = String.valueOf(code.charAt(i)).equals("1") ? true : false;
            if (str) mode = mode == 0 ? 1 : 0;

            if(mode == 0 && i % 2 == 0) {
                if(str) {
                    mode = 1;
                    continue;
                } else {
                    answer += String.valueOf(code.charAt(i));

                }

            } else if (mode == 1 && i % 2 == 1) {
                if(str) {
                    mode = 1;
                    continue;
                } else {
                    answer += String.valueOf(code.charAt(i));
                }
            }
        }

        System.out.println("ret = " + answer);


    }
}
