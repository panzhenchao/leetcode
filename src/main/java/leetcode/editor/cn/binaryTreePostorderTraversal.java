//给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[3,2,1]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点的数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 👍 891 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class binaryTreePostorderTraversal{
    //2022-07-30 14:26:22
    //二叉树的后序遍历
    //编号：[145]
    
    public static void main(String[] args) {
        Solution solution = new binaryTreePostorderTraversal().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer>  list=  new ArrayList<Integer>();
            digui(list,root);
            return list;



    }
    private void digui(List<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        digui(list,root.left);
        digui(list,root.right);
        list.add(root.val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}