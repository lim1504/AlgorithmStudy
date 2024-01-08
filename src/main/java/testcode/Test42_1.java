package testcode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test42_1 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        String answer = "";

        answer = IntStream.range(0, my_strings.length).mapToObj(i -> {
            return my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }).collect(Collectors.joining());

        System.out.println("answer = " + answer);
    }
}
