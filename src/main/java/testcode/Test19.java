package testcode;

/**
 * 고려해야할 점.
 * - 연산자의 경우의 수는 총 4가지.
 * - 너무 어렵게 생각한 코드이다.
 * 1. 코드가 너무 지저분해 가독성이 떨어짐
 * 2. 다른 메소드를 만들어 추가 연산과정을 할 필요가 없었음.
 * if 문과 switch 문 모두가 사용됨.
 */
public class Test19 {
    public static void main(String[] args) {
        int answer = 0;
        int middleAnswer = 0;
        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m =50;
        //1 : >
        // 2 : >=
        // 3 : <
        // 4 : <=

        middleAnswer = eq.equals("!") ? 0 + ineqSign(ineq) : 1 + ineqSign(ineq);

        switch (middleAnswer) {

            case 1 :
                 answer = n > m ? 1 : 0;
                break;
            case 2 :
                 answer = n >= m ? 1 : 0;
                break;
            case 3 :
                answer = n < m ? 1 : 0;
                break;
            case 4 :
                answer = n <= m ? 1: 0;
                break;
        }

        System.out.println("answer = " + answer);
    }

    public static int ineqSign(String ineq) {
        int result = 0;

        if(ineq.equals(">")) {
            result = 1;
        } else {
            result = 3;
        }
        return result;
    }
}
