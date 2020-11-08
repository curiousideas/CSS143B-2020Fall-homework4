package Problem1;

import java.util.ArrayList;
import java.util.List;
// This video helped me
// https://www.youtube.com/watch?v=idmgLLNIC2U

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permuteHelper(nums, result, used, new ArrayList<>());
        return result;
    }

    public static void permuteHelper(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> list) {

        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            permuteHelper(nums, result, used, list);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}