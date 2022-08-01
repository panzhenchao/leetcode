//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
// Related Topics 树 广度优先搜索 二叉树 👍 1407 👎 0

package leetcode.editor.cn;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class binaryTreeLevelOrderTraversal{
    //2022-07-30 14:47:00
    //二叉树的层序遍历
    //编号：[102]
    
    public static void main(String[] args) {
        Solution solution = new binaryTreeLevelOrderTraversal().new Solution();
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root==null){
            return lists;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temNode = queue.poll();
                list.add(temNode.val);
                if(temNode.left!=null){
                    queue.offer(temNode.left);
                }
                if(temNode.right!=null){
                    queue.offer(temNode.right);
                }
            }
            lists.add(list);

        }
        return lists;

    }


}
//leetcode submit region end(Prohibit modification and deletion)

}