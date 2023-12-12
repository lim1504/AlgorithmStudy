package testcode;

/**
 * 고려해야할 점
 * 1. 유연한 사고가 필요하다.
 * 2. 자바 기능에 대한 이해도가 필요하다. substring 혹은 for
 * 3. 증감식에 대한 유연한 활용을 한다면 심플코드 작성 가능
 */
public class Test10 {
    public static void main(String[] args) {
        String answer = "";
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        int j = 0;
        int overwriteIndex = overwrite_string.length();
        int end = s + overwriteIndex;

        char [] charArray = my_string.toCharArray();
        char [] overwriteArray = overwrite_string.toCharArray();

        for (int i = 0; i < my_string.length(); i++) {
            if (s <= i && i < end) {

                charArray[i] = overwriteArray[j++];
            }
        }

        answer = new String(charArray);

        //1. subString을 할용한 예제.
        String before = my_string.substring(0, s);
        String after = my_string.substring(0, s + overwriteIndex);

        answer = before + overwrite_string + after;
        System.out.println("answer_1 = " + answer);

        //2. char 변환 업그레이드
        char [] charArray2 = my_string.toCharArray();
        char [] overwriteArray2 = overwrite_string.toCharArray();

        for (int i = 0; i < overwriteArray2.length; i++) {

            charArray2[i + 2] = overwriteArray2[i];
        }

        answer = String.valueOf(charArray2);

    }
}
