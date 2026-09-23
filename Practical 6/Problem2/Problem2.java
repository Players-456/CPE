import java.util.*;

public class Problem2 {

    static void permutations(int[] nums, ArrayList<Integer> list, boolean[] used) {

        if (list.size() == nums.length) {
            System.out.println(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!used[i]) {

                used[i] = true;
                list.add(nums[i]);

                permutations(nums, list, used);

                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        permutations(nums, list, used);
    }
}