public class TrailingZeroes {

    public static int trailingZeroes(int n) {

        int count = 0;

        // Count factors of 5
        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 20;

        System.out.println("Trailing Zeroes = " + trailingZeroes(n));
    }
}