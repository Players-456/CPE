public class FastExponentiation {

    public static long power(long a, long n) {

        long ans = 1;

        while (n > 0) {

            // If exponent is odd
            if (n % 2 == 1)
                ans = ans * a;

            // Square the base
            a = a * a;

            // Divide exponent by 2
            n = n / 2;
        }

        return ans;
    }

    public static long modPower(long a, long n, long mod) {

        long ans = 1;

        a = a % mod;

        while (n > 0) {

            // If exponent is odd
            if (n % 2 == 1)
                ans = (ans * a) % mod;

            // Square the base
            a = (a * a) % mod;

            // Divide exponent by 2
            n = n / 2;
        }

        return ans;
    }

    public static void main(String[] args) {

        long a = 3;
        long n = 5;
        long mod = 100;

        System.out.println("Power = " + power(a, n));
        System.out.println("Power Mod = " + modPower(a, n, mod));
    }
}