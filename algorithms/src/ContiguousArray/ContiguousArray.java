package algorithms.src.ContiguousArray;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if (count == 0)
                result = Math.max(result, i+1);
            if (map.containsKey(count)) {
                result = Math.max(result, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }

        return result;
    }
}
