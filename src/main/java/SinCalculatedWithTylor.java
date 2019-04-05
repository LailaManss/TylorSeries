public class SinCalculatedWithTylor {

    public double calc(double x, int n) {
        double sinus = 0;
        for (int i = 0; i < n; i++) {
            int m = 2 * i + 1;
            double sign = Math.pow(-1, i);
            sinus += sign * Math.pow(x, m) / factorial(m);
        }
        return sinus;
    }


    public long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}