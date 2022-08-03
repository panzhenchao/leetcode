package leetcode.editor.cn;

//给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右轮转 1 步: [7,1,2,3,4,5,6]
//向右轮转 2 步: [6,7,1,2,3,4,5]
//向右轮转 3 步: [5,6,7,1,2,3,4]
// 
//
// 示例 2: 
//
// 
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释: 
//向右轮转 1 步: [99,-1,-100,3]
//向右轮转 2 步: [3,99,-1,-100] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 0 <= k <= 10⁵ 
// 
//
// 
//
// 进阶： 
//
// 
// 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。 
// 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？ 
// 
//
// 
// 
//
// 
// 
// Related Topics 数组 数学 双指针 👍 1540 👎 0

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        Solution solution = new RotateArray().new Solution();
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 3;
        solution.rotate(nums, k);
        System.out.println(JSON.toJSONString(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;


            int count = gcd(k, n);

            for (int i = 0; i < count; i++) {
                int current = i;
                int prev = nums[i];
                do {
                    int next = (current + k) % n;
                    int tempNext = nums[next];
                    nums[next] = prev;
                    current = next;
                    prev = tempNext;
                } while (i != current);
            }
        }

        private int gcd(int x, int y) {
            return y > 0 ? gcd(y, x % y) : x;
        }


    }


//leetcode submit region end(Prohibit modification and deletion)
}

