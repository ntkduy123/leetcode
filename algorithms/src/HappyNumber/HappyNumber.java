package algorithms.src.HappyNumber;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }

        if (n == 145) {
            return false;
        }

        return isHappy(getSquareDigitSum(n));
    }

    public int getSquareDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
