public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int xor = 0;
        int n = nums.length;

        // XOR numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR all array elements
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};

        System.out.println("Missing Number = " + missingNumber(nums));
    }
}