package org.muzychuk.boris.trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {

    @Test
    void iterativeTraverse() {
        TreeNode root = new TreeNode(
                9,
                new TreeNode(4,
                        new TreeNode(8, null, null),
                        new TreeNode(3, null, null)),

                new TreeNode(-1,
                        new TreeNode(7, null, null),
                        new TreeNode(6, null, null)));

        DepthFirstSearch dsf = new DepthFirstSearch();
        List<Integer> actual = dsf.iterativeTraverse(root);
        List<Integer> expected = List.of(9, 4, 8, 3, -1, 7, 6);
        assertEquals(expected, actual);
    }

    @Test
    void traverse() {
        TreeNode root = new TreeNode(
                9,
                new TreeNode(4,
                        new TreeNode(8, null, null),
                        new TreeNode(3, null, null)),

                new TreeNode(-1,
                        new TreeNode(7, null, null),
                        new TreeNode(6, null, null)));

        DepthFirstSearch dsf = new DepthFirstSearch();
        List<Integer> actual = dsf.traverse(root);
        List<Integer> expected = List.of(9, 4, 8, 3, -1, 7, 6);
        assertEquals(expected, actual);
    }
}