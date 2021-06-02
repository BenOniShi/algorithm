package com.benonshi.tree;

import com.benonshi.model.TreeNode;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 * @author BenOniShi
 * @date 2021/5/29 0:14
 */
public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        return cur(root) != -1;
    }

    public int cur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = cur(root.left);
        // 剪枝
        if (left == -1) {
            return -1;
        }
        int right = cur(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
