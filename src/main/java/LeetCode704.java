/**
 * ClassName: LeetCode704
 * Package: PACKAGE_NAME
 * Description:二分查找
 *
 * @Author: Dust
 * @Create 2023/11/1 16:55
 * @Version 1.0
 */
public class LeetCode704 {
    public static void main(String[] args) {

    }
    //第一种
    public static int search1(int[] nums, int target) {
        if(target<nums[0] || target>nums[nums.length - 1]){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid]>target) {
                right = mid-1;
            }else if (nums[mid] < target) {
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //第二种
    public static int search2(int[] nums, int target) {

        return -1;
    }
}
