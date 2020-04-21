package algorithms.src.SubtractProductSum;

public class SubtractProductSum {

    public static int subtractProductSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n = n / 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductSum(234));
    }
}
