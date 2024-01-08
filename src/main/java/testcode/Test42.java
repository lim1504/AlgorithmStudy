package testcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test42 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        String answer = "";
        int i = 0;

        for (int[]part : parts) {
            answer += my_strings[i++].substring(part[0], part[1] + 1);
        }


        System.out.println("answer = " + answer);
    }
}
