/**
 * ClassName: LeetCode209
 * Package: PACKAGE_NAME
 * Description:长度最小的数组
 *
 * @Author: Dust
 * @Create 2023/11/1 18:13
 * @Version 1.0
 */
public class LeetCode209 {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = new int[] { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen1(target, nums));
    }

    // 暴力解法 (超出时间限制)
    public static int minSubArrayLen1(int target, int[] nums) {
        int result = nums.length;
        int subLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    subLength = j - i + 1;
                    result = Math.min(result, subLength);
                    // result = j - i + 1;
                    break;
                }
            }
        }

        return result == nums.length && subLength != nums.length ? 0 : result;
    }

    // 滑动窗口
    public static int minSubArrayLen2(int target, int[] nums) {
        int result = nums.length;
        int sum = 0;
        int subLength = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLength = j - i + 1;
                result = Math.min(result, subLength);
                sum -= nums[i++];
            }
        }
        return result == nums.length && subLength!= nums.length? 0 : result;
    }
}
