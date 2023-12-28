package testcode;

import java.util.Arrays;

/**
 * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
 * 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 *
 * 고려해야할 점
 * 1. 배열은 동적으로 추가기능에 대한 지식 보유
 * 2. 배열의 범위에 대한 지식을 정확히 알고 있을 것.
 * 3. 조건문에 대한 범위
 * - Arrays.copyOf()
 *
 * 피드백
 * 1. 스트림으로 구성도 고려
 * 2. 조금 더 간소하게 작성할 수 있는 방법을 고려 (읽기 쉽게)
 *
 */
public class Test26 {
    public static void main(String[] args) {
        int[] num_list = {5,2,1,7,5};
        int addIdx = 0;

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            addIdx = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else if (num_list[num_list.length - 1] <= num_list[num_list.length - 2]){
            addIdx = (num_list[num_list.length - 1] * 2);
        }

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        answer[answer.length - 1] = addIdx;

        System.out.println("answer = " + Arrays.toString(answer));
    }
}
