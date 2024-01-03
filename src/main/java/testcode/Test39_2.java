package testcode;

/**
 * 숫자 범위 int, long
 * parseLong / valueOf
 * '0'
 */
public class Test39_2 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            /**
             * charAt로 int 형을 출력하게되면, 아스키코드값으로 출력하게됨.
             * 따라서 '0' 을 빼주는 것은 48을 빼주는 것과 마찬가지. => 실제 숫자를 리턴할 수 있게 된다.
             */
            answer += number.charAt(i) - '0';
        }
        answer = answer % 9;
        
        System.out.println("answer = " + answer);
    }
}
