public class Problem2 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        int prev2 = 0;
        int prev1 = 0;

        for (int i = 0; i < nums.length; i++) {

            int current = Math.max(prev1, prev2 + nums[i]);

            prev2 = prev1;
            prev1 = current;
        }

        System.out.println("Maximum amount = " + prev1);
    }
}