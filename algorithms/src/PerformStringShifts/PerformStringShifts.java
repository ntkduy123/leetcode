package algorithms.src.PerformStringShifts;

import java.util.Map;

public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int count = 0;
        for (int[] ints : shift) {
            count = count + (ints[0] == 1 ? ints[1] : -ints[1]);
        }

        int newPos = 0;
        int length = s.length();
        int steps = Math.abs(count % s.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (count < 0) {
                if (i + steps > length - 1) {
                    newPos = i + steps - length;
                } else {
                    newPos = i + steps;

                }
            } else {
                if (i - steps < 0) {
                    newPos = i - steps + length;
                } else {
                    newPos = i - steps;
                }
            }
            System.out.println(i + " " + newPos + " " + steps + " " + count);
            result.append(s.charAt(newPos));
        }
        return result.toString();
    }
}
