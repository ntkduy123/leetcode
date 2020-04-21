package algorithms.src.Bulbs;

public class Bulbs {

    public static int numberMomentsBulbOn(int[] bulbs) {
        int maxBulbs = 0;
        int sumBulbs = 0;
        int result = 0;
        for (int i = 0; i < bulbs.length; i++) {
            if (bulbs[i] > maxBulbs) {
                maxBulbs = bulbs[i];
            }

            sumBulbs += bulbs[i];

            int maxSumBulb = maxBulbs * (maxBulbs + 1) / 2;

            if (sumBulbs == maxSumBulb) result += 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberMomentsBulbOn(new int[]{1, 2, 4, 5, 3}));
    }

}
