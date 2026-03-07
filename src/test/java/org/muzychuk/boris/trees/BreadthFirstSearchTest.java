package org.muzychuk.boris.trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTest {

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
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        List<Integer> actual = bfs.traverse(root);
        List<Integer> expected = List.of(9, 4, -1, 8, 3, 7, 6);
        assertEquals(expected, actual);
    }

}