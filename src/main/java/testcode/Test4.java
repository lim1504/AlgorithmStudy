package testcode;

import java.util.Scanner;

/**
 * 고려해야할 점
 * 1. java lang Character 에 대한 이해도 필요.
 * 2. StringBuilder 에 대한 활용 방법
 *
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder builder = new StringBuilder();
        char[] charArray =  a.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if(Character.isUpperCase(c)) {
                builder.append(Character.toLowerCase(c));
            } else {
                builder.append(Character.toUpperCase(c));
            }

        }

        System.out.println(builder.toString());
    }
}
