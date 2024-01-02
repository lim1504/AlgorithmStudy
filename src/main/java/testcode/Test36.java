package testcode;

/**
 * 연산자 규칙에 대한 조건 파악문제
 * v  = or
 * ^ = and
 * (x1 ∨ x2) ∧ (x3 ∨ x4) 조건을 부합하는 식 작성
 */
public class Test36 {
    public static void main(String[] args) {
        boolean x1 = true;
        boolean x2 = false;
        boolean x3 = false;
        boolean x4 = false;
        boolean answer = true;

        answer = (x1 || x2) && (x3 || x4);

        System.out.println("answer = " + answer);
    }
}
