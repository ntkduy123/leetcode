package algorithms.src.Pow;

import java.util.HashMap;
import java.util.Map;

public class Pow {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        if (n == -1) {
            return 1 / x;
        }

        double result = 1;
        if (n % 2 == 0) {
            result = result * myPow(x * x, n / 2);
        } else {
            result = result * myPow(x * x, (n - 1) / 2) * x;
        }
        return result;
    }
}
