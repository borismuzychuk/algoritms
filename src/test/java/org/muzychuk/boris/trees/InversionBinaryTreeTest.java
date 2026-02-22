package org.muzychuk.boris.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InversionBinaryTreeTest {

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(2, null, null),
                new TreeNode(1, null, null));

        InversionBinaryTree inversionBinaryTree = new InversionBinaryTree();
        TreeNode invertedTreeRoot = inversionBinaryTree.invertTree(root);
        assertEquals(1, invertedTreeRoot.left.val);
        assertEquals(2, invertedTreeRoot.right.val);

        root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),

                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        inversionBinaryTree = new InversionBinaryTree();
        invertedTreeRoot = inversionBinaryTree.invertTree(root);
        assertEquals(3, invertedTreeRoot.left.val);
        assertEquals(2, invertedTreeRoot.right.val);
        assertEquals(7, invertedTreeRoot.left.left.val);
        assertEquals(6, invertedTreeRoot.left.right.val);
        assertEquals(5, invertedTreeRoot.right.left.val);
        assertEquals(4, invertedTreeRoot.right.right.val);
    }
}