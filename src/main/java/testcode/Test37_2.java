package testcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 배열로 푸는 방법
 * 주사위 숫자는 크기가 다르지만, 최소 2개 이상이 같은 경우의 수를 체크 할 것
 * 4, 3, 2, 1 => 2개인 경우에 2 / 2개 씩 같은지, 2 / 1 / 1 같은지에 대한 체크가 중점
 * 2 / 2 세트인 경우 |p - q| 주목할 것 (둘중 큰 수가 좌측 기준 점)
 */
public class Test37_2 {
    public void main(String[] args) {
        int a = 6, b = 3, c = 3, d = 6;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : new int[] {a, b, c, d}) {
            if (map.containsKey(data)) map.put(data, map.get(data) + 1);
            else map.put(data, 1);
        }

        /**
         * 우선순위 큐 => 최소 요소를 효율적으로 검색, 특정 순서 (작은것 부터 가장 큰것까지 요소)를 처리하는 상황에서 유리
         */
        PriorityQueue<Dice> pq = new PriorityQueue<>();
        for (int key : map.keySet())
            pq.add(new Dice(key, map.get(key)));

        if (pq.size() == 1) answer = pq.poll().number * 1111;
        else if (pq.size() == 3) {
            pq.poll();
            answer = pq.poll().number * pq.poll().number;
        } else if (pq.size() == 4) {
            pq.poll(); pq.poll(); pq.poll();
            answer = pq.poll().number;
        } else {
            Dice maxDice = pq.poll();
            Dice next = pq.poll();
            if (maxDice.count == 3) {
                answer = (10 * maxDice.number + next.number) * (10 * maxDice.number + next.number);
            } else {
                answer = (maxDice.number + next.number) * ((int)(Math.abs(maxDice.number - next.number)));
            }
        }
    }
    public class Dice implements Comparable<Dice> {
        int number;
        int count;
        public Dice(int number, int count) {
            this.number = number;
            this.count = count;
        }

        @Override
        public int compareTo(Dice o) {
            if (this.count == o.count)
                return o.number - this.number;
            return o.count - this.count;
        }
    }
}
