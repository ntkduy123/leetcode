package algorithms.src.GroupPeople;

import java.util.*;

public class GroupPeople {

    public static List<List<Integer>> groupPeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();
        List<Integer> group;
        for (int i = 0; i < groupSizes.length; i++) {
            if (!groups.containsKey(groupSizes[i])) {
                group = new ArrayList<>();
                groups.put(groupSizes[i], group);
            }

            groups.get(groupSizes[i]).add(i);
        }

        group = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : groups.entrySet()) {
            int size = entry.getKey();
            for (int i : entry.getValue()) {
                group.add(i);

                if (group.size() == size) {
                    result.add(group);
                    group = new ArrayList<>();
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> test = groupPeople(new int[]{3,3,3,3,3,1,3});
        for (List<Integer> a : test) {
            for (Integer i : a) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
