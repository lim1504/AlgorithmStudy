package testcode;

import java.util.Map;
import java.util.function.BiFunction;

/**
 * - BiFunction 이해도
 * - 함수형 인터페이스
 * - String 형태의 key1
 * - int, int 형식의 숫자의 비교 값
 * - 결과값 출력
 */
public class Test19_2 {
    public static void main(String[] args) {
        int answer = 0;
        String ineq = "";
        String eq = "";
        int n = 0;
        int m = 0;

        Map<String, BiFunction<Integer, Integer, Boolean>> map = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
                );

        int i = map.get(ineq + eq).apply(n, m) ? 1 : 0;
    }
}
