package algorithms.src.LastStoneWeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() >= 2) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();
            queue.offer(stone1 - stone2);
        }
        return queue.size() == 0 ? 0 : queue.poll();
    }
}
