package org.muzychuk.boris.trees;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumDepthBinaryTree {

    /*
     * Recursive DFS
     * */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left) + 1;
        int rightDepth = maxDepth(root.right) + 1;
        return java.lang.Math.max(leftDepth, rightDepth);
    }

    /*
     * Iterative DFS (Stack)
     * */
    public int computeMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<Pair<TreeNode, Integer>> stackNodes = new LinkedList<>();
        stackNodes.push(new Pair<>(root, 1));
        int maxDepth = 0;
        while (!stackNodes.isEmpty()) {
            Pair<TreeNode, Integer> nodeDepth = stackNodes.pop();
            if (nodeDepth.key() != null) {
                maxDepth = Math.max(maxDepth, nodeDepth.value());
                stackNodes.push(new Pair<>(nodeDepth.key().left, nodeDepth.value() + 1));
                stackNodes.push(new Pair<>(nodeDepth.key().right, nodeDepth.value() + 1));
            }
        }
        return maxDepth;
    }
}
