public class ExtendedEuclidean {

    static int x, y;

    public static int gcd(int a, int b) {

        // Base case
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }

        // Recursive call
        int gcd = gcd(b, a % b);

        // Update x and y
        int temp = x;
        x = y;
        y = temp - (a / b) * y;

        return gcd;
    }

    public static void main(String[] args) {

        int a = 35;
        int b = 15;

        int gcd = gcd(a, b);

        System.out.println("GCD = " + gcd);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}