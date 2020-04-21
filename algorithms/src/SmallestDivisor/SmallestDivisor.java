package algorithms.src.SmallestDivisor;

public class SmallestDivisor {

    public static int smallestDivisor(int[] nums, int threshold) {
        double sum = 0;
        for (double n : nums) {
            sum += Math.ceil(n / threshold);
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{2,3,5,7,11}, 11));
    }
}
