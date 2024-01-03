package testcode;

/**
 * 숫자 범위 int, long
 * parseLong / valueOf
 */
public class Test39 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        int answer = 0;
        char[] arr = number.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            long l = 0L;
            long l1 = Long.valueOf(arr[i]);
            l += Long.parseLong(String.valueOf(arr[i]));
            answer += (int) l;
        }

        answer = answer % 9;
        System.out.println("answer = " + answer);
    }
}
