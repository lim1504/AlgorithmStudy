package testcode;

/**
 * 숫자 범위 int, long
 * parseLong / valueOf
 * '0'
 * Stream
 */
public class Test39_3 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        int answer = 0;
        /**
         * number.chars() => IntStream
         */
        answer = number.chars().map(i -> (i - '0')).sum() % 9;

        System.out.println("answer = " + answer);
    }
}
