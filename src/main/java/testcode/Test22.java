package testcode;

/**
 * 1. a는 시작 숫자, b는 등차 숫자
 * 2. included 배열에 true만 체크
 * 3. 더한 수를 가지고 있어야함.
 */
public class Test22 {
    public static void main(String[] args) {
        int a = 7;
        int d = 1;
        int answer = 0;
        int temp = 0;
        boolean[] included = {false, false, false, true, false, false, false};

        for (int i = 0; i < included.length; i++) {

            if(i == 0 && included[i]) {
                temp += a;
                answer += temp;
            } else if (i == 0 && !included[i]) {
                temp += a;
            }
            else if(i > 0 && included[i]) {
                temp += d;
                answer += temp;
            } else {
                temp += d;
            }
        }

        System.out.println("answer = " + answer);
    }
}
