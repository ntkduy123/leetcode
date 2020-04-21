package algorithms.src.CountingElements;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (set.contains(num + 1)) {
                result++;
            }
        }
        return result;
    }
}
