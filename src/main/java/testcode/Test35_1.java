package testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * arr과 stk 배열이 있다.
 * stk 배열이 비어있다면, arr[i] stk 에 추가.
 * arr [i] > stk 라면, arr[i] stk 에 추가.
 * arr [i] <= stk 라면, stk 마지막 제거 && i 유지
 *
 * - stack
 * - ArrayList & for
 * - LinkedList (0)
 *
 */
public class Test35_1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        //LinkedList 활용하여, 마지막 요소를 제거할 수 있는 기능 사용.
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if(list.isEmpty()) {
                list.add(arr[i]);
            }
            else if (arr[i] > list.get(list.size() - 1)) {
                list.add(arr[i]);
            }
            else {
                list.pollLast();
                i--;
            }
        }

        int[] stk = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("stk = " + Arrays.toString(stk));
    }
}
