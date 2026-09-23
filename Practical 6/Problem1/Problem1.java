import java.util.*;

public class Problem1 {
    
    static void subsets(int[] nums, int index, ArrayList<Integer> list) {
        
        if (index == nums.length) {
            System.out.println(list);
            return;
        }

        // Do not include
        subsets(nums, index + 1, list);

        // Include
        list.add(nums[index]);
        subsets(nums, index + 1, list);

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<>();

        subsets(nums, 0, list);
    }
}