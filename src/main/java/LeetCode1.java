import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: LeetCode1
 * Package: PACKAGE_NAME
 * Description:两数之和
 *
 * @Author: Dust
 * @Create 2023/10/31 21:31
 * @Version 1.0
 */
public class LeetCode1 {

    /**
     * 两数之和的解法1：
     * 遍历数组，使用两个循环嵌套，依次计算每两个数字的和，如果和等于目标值，则返回两个数字的下标。
     * 如果遍历完整个数组都没有找到满足条件的数字对，则返回一个长度为数组长度的数组。
     *
     * @param nums 给定的数组
     * @param target 目标值
     * @return 一个长度为2的数组，包含两个数字的下标，使对应的数字之和等于目标值。如果不存在这样的数字对，则返回长度为数组长度的数组。
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[nums.length];
    }

    /**
     * 两数之和的解法2：
     * 遍历数组，同时使用一个HashMap来存储每个数字的下标。
     * 对于每个数字，计算目标值减去当前数字得到的差值，在HashMap中查找是否有这个差值。
     * 如果找到了差值，则返回HashMap中存储的差值的下标和当前数字的下标。
     * 如果遍历完整个数组都没有找到满足条件的数字对，则返回一个长度为数组长度的数组。
     *
     * @param nums 给定的数组
     * @param target 目标值
     * @return 一个长度为2的数组，包含两个数字的下标，使对应的数字之和等于目标值。如果不存在这样的数字对，则返回长度为数组长度的数组。
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[nums.length];
    }

}

