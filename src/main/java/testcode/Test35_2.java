package testcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * arr과 stk 배열이 있다.
 * stk 배열이 비어있다면, arr[i] stk 에 추가.
 * arr [i] > stk 라면, arr[i] stk 에 추가.
 * arr [i] <= stk 라면, stk 마지막 제거 && i 유지
 *
 * - stack (o)
 * - ArrayList & for
 * - LinkedList
 *
 */
public class Test35_2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        //Stack 선입후출 구조 활용
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
            else {
                stack.pop();
                i --;
            }
        }
        int[] stk = stack.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("stk = " + Arrays.toString(stk));

        //2.
        Stack<Integer> stack2 = new Stack<>();

        for (int i : arr) {
            while (!stack2.empty() && i <= stack2.peek()) stack2.pop();
            stack2.push(i);
        }
        int[] stk2 = stack2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("stk2 = " + Arrays.toString(stk2));
    }
}
