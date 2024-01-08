package testcode;


public class Test42_2 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i ++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }

        String answer = sb.toString();
        System.out.println("answer = " + answer);
    }
}
