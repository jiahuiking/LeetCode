/**
 * ClassName: LeetCode27
 * Package: PACKAGE_NAME
 * Description:移除元素
 *
 * @Author: Dust
 * @Create 2023/11/1 17:38
 * @Version 1.0
 */
public class LeetCode27 {
    public static void main(String[] args) {

    }
    // 暴力解法
    public static int removeElement1(int[] nums, int val) {
        int nums_len = nums.length;
        for (int i = 0; i < nums_len; i++) {
            if (nums[i] == val){
                for (int j = i + 1; j < nums_len; j++){
                    nums[j-1]=nums[j];
                }
                i--;
                nums_len--;
            }
        }
        return nums_len;
    }

    // 双指针法
    public static int removeElement2(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex= 0;fastIndex<nums.length;fastIndex++) {
            if (val != nums[fastIndex]){
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        return slowIndex;
    }

    // 相向双指针法
    public static int removeElement3(int[] nums, int val) {

        return 0;
    }
}
