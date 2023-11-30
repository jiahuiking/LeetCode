/**
 * ClassName: LeetCode977
 * Package: PACKAGE_NAME
 * Description:有序数组的平方
 *
 * @Author: Dust
 * @Create 2023/11/1 17:56
 * @Version 1.0
 */
public class LeetCode977 {
    public static void main(String[] args) {

    }

    // 暴力排序
    public static int[] sortedSquares1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right){
            if(nums[left]*nums[left] < nums[right]*nums[right]){
                res[index--] = nums[right]*nums[right];
                --right;
            }
            else {
                res[index--] = nums[left]*nums[left];
                ++left;
            }
        }
        return res;
    }
}
