package red.reksai.leetcodealgorithms.两数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @date : 2019-04-03 13:16
 * @since :
 */
public class Solution {

    public static void main(String[] args) {
        int[] source = {2,11,15,7};
        int target = 9;
        twoSum(source,target);
    }

    /**
     *
     * @param nums  给定数组
     * @param target    目标值
     * @return  相加等于目标值的两个数的坐标数组
     */
    public static int[] twoSum(int[] nums, int target) {
        int [] sourceNums = nums ;
        Arrays.sort(nums);
        return null ;
    }
}
