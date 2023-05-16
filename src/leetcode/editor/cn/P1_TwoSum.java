//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// 只会存在一个有效答案 
// 
//
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？ 
//
// Related Topics 数组 哈希表 👍 17011 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author Jack
 * @date 2023-05-16 21:00:26
 */
public class P1_TwoSum {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P1_TwoSum().new Solution();
        int[] ints=solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    // 暴力枚举
    // 时间复杂度：O(N2),空间复杂度：O(1)
    //class Solution {
    //    public int[] twoSum(int[] nums, int target) {
    //        for (int i = 0; i < nums.length; i++) {
    //            for (int j = i + 1; j < nums.length; j++) {
    //                if ((nums[i] + nums[j]) == target) {
    //                    return new int[]{i, j};
    //                }
    //            }
    //        }
    //        return new int[0];
    //    }
    //}
    // 哈希表,寻找的元素之间存在关系,可以构建哈希表，用target-x查找
    // 时间复杂度为O(N),空间复杂度：O(N)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>(nums.length);
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)

}
