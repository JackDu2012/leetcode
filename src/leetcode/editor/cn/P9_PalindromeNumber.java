//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 
// 例如，121 是回文，而 123 不是。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
//
// Related Topics 数学 👍 2535 👎 0

package leetcode.editor.cn;

/**
 * 回文数
 *
 * @author Jack
 * @date 2023-05-17 09:48:34
 */
public class P9_PalindromeNumber {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P9_PalindromeNumber().new Solution();
        System.out.println(solution.isPalindrome(1));
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 两个数组。第二个是第一个的逆序
        //public boolean isPalindrome(int x) {
        //    if (x < 0) {
        //        return false;
        //    }
        //    String xStr = String.valueOf(x);
        //    char[] xchars = xStr.toCharArray();
        //    char[] ychars = new char[xchars.length];
        //    for (int i = xchars.length - 1; i >= 0; i--) {
        //        ychars[xchars.length - 1 - i] = xchars[i];
        //    }
        //    String yStr = String.valueOf(ychars);
        //    return xStr.equals(yStr);
        //}
        // 一个数组，交换位置，循环到1/2处即可
        //public boolean isPalindrome(int x) {
        //    if (x < 0) {
        //        return false;
        //    }
        //    String xStr = String.valueOf(x);
        //    char[] chars = xStr.toCharArray();
        //    for (int i = 0; i < (chars.length / 2); i++) {
        //        char temp = chars[chars.length - 1 - i];
        //        chars[chars.length - 1 - i] = chars[i];
        //        chars[i] = temp;
        //    }
        //    String yStr = String.valueOf(chars);
        //    return xStr.equals(yStr);
        //}
        // 直接使用stringBuilder进行翻转
        //public boolean isPalindrome(int x) {
        //    String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        //    return (x + "").equals(reversedStr);
        //}
        // 用取模的方式，直接把数取反
        public boolean isPalindrome(int x) {
            if (x < 0) { return false; }
            int cur = 0;
            int num = x;
            while (num != 0) {
                cur = cur * 10 + num % 10;
                num /= 10;
            }
            return cur == x;
        }
        // 用取模的方式，但是走一半就可以判断了,由于必须拿到length，导致性能反而下降
        //public boolean isPalindrome(int x) {
        //    if (x < 0) { return false; }
        //    int cur = 0;
        //    int num = x;
        //    int index = 0;
        //    String xStr = String.valueOf(x);
        //    if (xStr.length() == 1) {
        //        return true;
        //    }
        //    while (num != 0 && index < (xStr.length() / 2)) {
        //        cur = cur * 10 + num % 10;
        //        num /= 10;
        //        index++;
        //    }
        //    if (xStr.length() > 1 && xStr.length() % 2 != 0) {
        //        index++;
        //    }
        //    return cur == x / Double.valueOf(Math.pow(10, index)).intValue();
        //}
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
