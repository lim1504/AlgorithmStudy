package testcode;

public class Test27_3 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 0;
        String control = "asd";


        System.out.println("control.length() = " + control.length());

        String[] strArr = control.split("");
        long st = System.currentTimeMillis();
        for (String str : strArr){
            answer = str.equals("w") ? n += 1
                    : str.equals("s") ? n -= 1
                    : str.equals("d") ? n += 10
                    : str.equals("a") ? n -= 10
                    : 0;
        }
        long end = System.currentTimeMillis();
        System.out.printf("%d", end - st);

        long st2 = System.currentTimeMillis();
        for (String str : strArr){
            switch(str) {
                case "w": answer += 1; break;
                case "s": answer -= 1; break;
                case "d": answer += 10; break;
                case "a": answer -= 10; break;
                default:break;
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.printf("%d", end2 - st2);
    }
}
