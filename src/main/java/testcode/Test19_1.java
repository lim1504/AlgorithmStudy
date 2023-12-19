package testcode;

/**
 * 고려해야할 점.
 * 너무 어렵게 생각하면 안된다.
 * - 결국 연산자의 방향은 총 4개 간단히 if문으로도 해결가능하다.
 * - 연산자의 범위를 잘 고려해야한다.
 */
public class Test19_1 {
    public static void main(String[] args) {
        boolean answer;
        String ineq = "";
        String eq = "";
        int n = 0;
        int m = 0;

        if (ineq.equals(">") && eq.equals("=")){
            answer = n >= m;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m;
        } else {
            answer = n < m;
        }

        int result = answer ? 1: 0;
    }
}
