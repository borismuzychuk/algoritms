package org.muzychuk.boris.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    @Test
    void isBalanced() {

        TreeNode root = new TreeNode(
                1,
                new TreeNode(2, null, null),
                new TreeNode(3,
                        new TreeNode(4, null, null),
                        null)
        );

        BalancedBinaryTree balanceBinaryTree = new BalancedBinaryTree();
        boolean result = balanceBinaryTree.isBalanced(root);
        assertTrue(result);

        root = new TreeNode(
                1,
                new TreeNode(3,
                        new TreeNode(4,
                                new TreeNode(5, null, null),
                                null),
                        null),
                new TreeNode(2, null, null)
        );

        result = balanceBinaryTree.isBalanced(root);
        assertFalse(result);
    }
}