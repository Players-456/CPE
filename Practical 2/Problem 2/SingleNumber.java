public class SingleNumber {

    public static int[] singleNumber(int[] nums) {

        int xor = 0;

        // XOR all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Find rightmost set bit
        int diffBit = xor & (-xor);

        int num1 = 0;
        int num2 = 0;

        // Divide numbers into two groups
        for (int num : nums) {

            if ((num & diffBit) == 0)
                num1 ^= num;
            else
                num2 ^= num;
        }

        return new int[]{num1, num2};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 2, 5};

        int[] ans = singleNumber(nums);

        System.out.println("Unique Numbers = " + ans[0] + " " + ans[1]);
    }
}