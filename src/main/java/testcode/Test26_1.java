package testcode;

import java.util.Arrays;

/**
 * 코드를 간소화
 */
public class Test26_1 {
    public static void main(String[] args) {
        int[] num_list = {5,2,1,7,5};
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int first = num_list[num_list.length - 1];
        int sec = num_list[num_list.length - 2];

        answer[answer.length - 1] = first > sec ? first - sec : first * 2;

        System.out.println("answer = " + Arrays.toString(answer));
    }
}
