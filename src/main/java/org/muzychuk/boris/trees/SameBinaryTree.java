package org.muzychuk.boris.trees;

import java.util.Deque;
import java.util.LinkedList;

public class SameBinaryTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<Pair<TreeNode, TreeNode>> pairs = new LinkedList<>();
        pairs.push(new Pair<>(p, q));
        while (!pairs.isEmpty()) {
            Pair<TreeNode, TreeNode> pair = pairs.pop();
            if (pair.p == null && pair.q == null) {
                continue;
            }
            if (pair.p == null || pair.q == null) {
                return false;
            }
            if (pair.p.val != pair.q.val) {
                return false;
            }
            pairs.push(new Pair<>(pair.p.left, pair.q.left));
            pairs.push(new Pair<>(pair.p.right, pair.q.right));
        }
        return true;
    }

    public record Pair<P, Q>(P p, Q q) {

    }

}
