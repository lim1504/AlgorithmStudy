package testcode;


/**
 * 숫자 비교 조건문 3개 (모두같음, 두개만 같음, 모두 다름)
 * 거듭제곱을 묻는 문제
 * Math.pow 활용에 대한 문제.
 * - 거듭제곱을 위한 자바에서 지원하는 객체
 * - pow의 값이 음수거나, 0인 경우 1.0 리턴
 */
public class Test23_1 {
    public static void main(String[] args) {
        solution();
    }
    public static int solution() {
        int a = 5;
        int b = 3;
        int c = 3;
        int answer = 1;

        int cnt = 1;

        //두가지 수가 모두 같은 경우
        if (a == b || b == c || a == c) {
            cnt ++;
        }
        //모두 같은 경우
        else if (a == b && b == c) {
            cnt ++;
        }

        //중복된 숫자만큼의 수를 더하기 위한 작업
        for (int i = 1; i <= cnt; i++) {
            //Math.pow (거듭제곱 계산)
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }
        System.out.println("answer = " + answer);
        return answer;
    }


//    Math.pow 처럼 활용, 재귀시 b 오류 발생 가능
//    private int pow(int a, int b) {
//        if(b == 0) return 1;
//        return a * pow(a, b-1);
//    }
    private static int pow(int a, int b) {
        return (int) (a * Math.pow(a, b-1));
    }
}
