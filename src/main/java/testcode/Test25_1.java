package testcode;

public class Test25_1 {
    public static void main(String[] args) {
        int answer = 0;

        int even = 0;
        int odd = 0;
        int[] num_list = {3,4,5,2,1};

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;

            }
            else {
                odd *= 10;
                odd += num;
            }
        }
        answer = even + odd;

    }
}
