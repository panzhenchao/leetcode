//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
// Related Topics 数学 👍 3569 👎 0

package leetcode.editor.cn;
class reverseInteger{
    //2022-07-26 09:17:05
    //整数反转
    //编号：[7]
    
    public static void main(String[] args) {
        Solution solution = new reverseInteger().new Solution();
        // TO TEST
        int x=-1534236469;
        System.out.println(solution.reverse(x));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int revet=0;
        while (x!=0){


            if((revet < Integer.MIN_VALUE / 10 || revet > Integer.MAX_VALUE / 10)){
                return 0;
            }

            int tem=x%10;
            x=x/10;
            revet=revet*10+tem;
        }
        return revet;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}