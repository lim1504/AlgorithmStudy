package testcode;

/**
 * 숫자 범위 int, long
 * parseLong / valueOf
 */
public class Test39_1 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        answer = answer % 9;

        System.out.println("answer = " + answer);
    }
}
