package org.muzychuk.boris.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthBinaryTreeTest {

    @Test
    void maxDepth() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3,
                        new TreeNode(4, null, null), null)
        );
        MaximumDepthBinaryTree maximumDepthBinaryTree = new MaximumDepthBinaryTree();
        assertEquals(0, maximumDepthBinaryTree.maxDepth(null));
        assertEquals(3, maximumDepthBinaryTree.maxDepth(root));

    }

}
