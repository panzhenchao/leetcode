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
        if(root==null){
            return true;
        }
        LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            int nextCount=0;
            for(int i=0;i<size;i++){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    nextCount++;
                    queue.offer(treeNode.left);
                }else {
                    queue.offer(new TreeNode(101));
                }
                if(treeNode.right!=null){
                    nextCount++;
                    queue.offer(treeNode.right);
                }else {
                    queue.offer(new TreeNode(101));
                }

            }
            boolean symmetric = checkIsSymmetric(list);
            if(!symmetric){
                return false;
            }

            if(nextCount==0){
                break;
            }
        }
        return true;
    }
    private boolean checkIsSymmetric(ArrayList<Integer> list){
        if(list==null||list.size()<1){
            return false;
        }
        int size = list.size();
        int left=0;
        int right=size-1;
        while (left<right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}