package testcode;

/**
 * 단순히, 합의 제곱 / 모든 수의 곱을 비교
 * Math.pow => 거듭제곱에 대한 기능 제공
 */
public class Test24_1 {
    public static void main(String[] args) {
        int answer = 0;
        int[] num_list = {5, 7, 8, 3};

        int sum = 0;
        int multiply = 1;

        for (int i = 0; i < num_list.length; i++) {

            sum += num_list[i];
            multiply *= num_list[i];
        }

        answer = Math.pow(sum, 2) > multiply ? 1 : 0;

    }
}
