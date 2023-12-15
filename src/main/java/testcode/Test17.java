package testcode;

public class Test17 {
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;

        int answer = 0;

        answer = (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}
