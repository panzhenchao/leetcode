package leetcode.editor.cn;

/**
 * @author pzc
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月30日 14:06:00
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
