import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Solution.containsDuplicate(nums));
    }

    public static class Solution {
        public static boolean containsDuplicate(int[] nums) {
// первое решение за О(n^2) - это очень затратный по времени и резурсом подход
//            for (int j = 0; j < nums.length - 1; j++) {
//                for (int i = j + 1; i < nums.length; i++) {
//                    if (nums[j] == nums[i]) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }

// второе решение за О(n)
            HashSet<Integer> numsSet = new HashSet<>();
            for (int num : nums) {
                if (!numsSet.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
}
