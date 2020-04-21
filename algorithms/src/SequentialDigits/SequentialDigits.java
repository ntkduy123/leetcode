package algorithms.src.SequentialDigits;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public static List<Integer> sequentialDigits(int low, int high) {
        int[] POWERS_OF_10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        int nDigit = String.valueOf(low).length();
        int firstDigit = low / nDigit;

        int seqDigitNumber = 0;
        int increment = 0;
        for (int i = nDigit; i >= 1; i = i - 1) {
            increment += POWERS_OF_10[i - 1];
            seqDigitNumber += POWERS_OF_10[i - 1] * (nDigit - (i - 1));
        }

        List<Integer> result = new ArrayList<>();
        int first = seqDigitNumber;
        while (seqDigitNumber <= high) {
            if (seqDigitNumber >= low && seqDigitNumber <= high) {
                result.add(seqDigitNumber);
            }
            if (seqDigitNumber % 10 == 9) {
                nDigit = nDigit + 1;
                increment += POWERS_OF_10[nDigit - 1];
                seqDigitNumber = first;
                seqDigitNumber = seqDigitNumber + increment;
                first = seqDigitNumber;
                continue;
            }
            seqDigitNumber = seqDigitNumber + increment;
        }

        return result;
    }

    public static void main(String[] args) {
        sequentialDigits(58, 155);
    }
}
