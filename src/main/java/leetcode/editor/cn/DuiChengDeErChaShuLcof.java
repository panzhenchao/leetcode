package leetcode.editor.cn;

//请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
// 1 
// / \ 
// 2 2 
// / \ / \ 
//3 4 4 3 
//但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
// 1 
// / \ 
// 2 2 
// \ \ 
// 3 3 
//
// 
//
// 示例 1： 
//
// 输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
//
// 输入：root = [1,2,2,null,3,null,3]
//输出：false 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 1000 
//
// 注意：本题与主站 101 题相同：https://leetcode-cn.com/problems/symmetric-tree/ 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 371 👎 0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class DuiChengDeErChaShuLcof{
    // 层序遍历
    public static void main(String[] args) {
    	
        Solution solution = new DuiChengDeErChaShuLcof().new Solution();

        String treeNodeString="1,2,2,3,4,4,3";
        TreeNode tree = new StrToTreeNode().createTree(treeNodeString);
        System.out.println(solution.isSymmetric(tree));
    }

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {

        return check(root,root);

    }
    private boolean check(TreeNode rootLeft,TreeNode rootRight){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(rootLeft);
        queue.offer(rootRight);
        while (!queue.isEmpty()){
            TreeNode leftPoll = queue.poll();
            TreeNode rightPoll = queue.poll();
            if(leftPoll==null&&rightPoll==null){
                continue;
            }
            if((leftPoll==null||rightPoll==null)||(leftPoll.val!=rightPoll.val)){
                return false;
            }
            queue.offer(leftPoll.left);
            queue.offer(rightPoll.right);
            queue.offer(leftPoll.right);
            queue.offer(rightPoll.left);
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}