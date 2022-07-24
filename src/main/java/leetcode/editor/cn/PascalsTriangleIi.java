package leetcode.editor.cn;

//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
// Related Topics 数组 动态规划 👍 414 👎 0

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIi{
    public static void main(String[] args) {
    	
        Solution solution = new PascalsTriangleIi().new Solution();
        System.out.println(solution.getRow(0));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        //第一行就一个1
        triangle.get(0).add(1);

        for(int i=1;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i-1);
            //每行的第一个一定是1
            row.add(1);

            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            //每行的最后一个一定是1
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}