package testcode;

/**
 * 고려해야할 점
 * 1. 문자열 기능에 대한 파악이 핵심
 */
public class Test11 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = "";

        char[] startArray = str1.toCharArray();
        char[] endArray = str2.toCharArray();
        int sumIdx = startArray.length + endArray.length;
        char[] temp = new char[sumIdx];

        int j = 0;
        for (int i = 0; i < startArray.length; i++) {

            temp[j++] = startArray[i];
            temp[j++] = endArray[i];
        }

        answer = String.valueOf(temp);
        System.out.println(answer);

        //1. charAt() 활용.
        //-> 객체를 지정하여 사용하기 때문에 더 느림
        answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        System.out.println(answer);
    }
}
