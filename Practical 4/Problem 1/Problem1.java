class Problem1 {
    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min = nums.length + 1;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if (min == nums.length + 1)
            return 0;

        return min;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(7, nums));
    }
}