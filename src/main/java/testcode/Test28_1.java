package testcode;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * stream 을 활용한 비교.
 */
public class Test28_1 {
    public static void main(String[] args) {
        //"wsdawsdassw"
        int[] numlog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String answer = "";

        answer = IntStream.range(1, numlog.length).mapToObj(i -> {
            int num = numlog[i] - numlog[i - 1];
            String a = "";
            if (num == 1) a += "w";
            else if (num == -1) a += "s";
            else if (num == 10) a += "d";
            else if (num == -10) a += "a";
            return a;
        }).collect(Collectors.joining());

        System.out.println("answer = " + answer);

        answer = IntStream.range(1, numlog.length).mapToObj(i -> {
            int num = numlog[i] - numlog[i - 1];
            return switch (num) {
                case 1 -> "w";
                case -1 -> "s";
                case 10 -> "d";
                case -10 -> "a";
                default -> "";
            };
        }).collect(Collectors.joining());

        System.out.println("answer = " + answer);
    }
}
