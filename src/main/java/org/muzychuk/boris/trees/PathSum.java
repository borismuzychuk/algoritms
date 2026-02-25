package org.muzychuk.boris.trees;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair(root, targetSum - root.val));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> current = queue.poll();
            int currentSum = current.value();
            if (current.key().left == null
                    && current.key().right == null
                    && currentSum == 0) {
                return true;
            }
            if (current.key().left != null) {
                queue.offer(new Pair<>(current.key().left, currentSum - current.key().left.val));
            }
            if (current.key().right != null) {
                queue.offer(new Pair<>(current.key().right, currentSum - current.key().right.val));
            }
        }
        return false;
    }

}
