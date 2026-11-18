
class Solution {
    public double myPow(double x, int n) {

        long power = n;

        boolean negative = power < 0;

        if (power < 0) {
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {

            if (power % 2 == 1) {
                result = result * x;
            }

            x = x * x;
            power = power / 2;
        }

        if (negative) {
            result = 1.0 / result;
        }

        return result;
    }
}
