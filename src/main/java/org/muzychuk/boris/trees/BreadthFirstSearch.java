package org.muzychuk.boris.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    public List<Integer> traverse(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        bsf(root, values);
        return values;
    }

    private void bsf(TreeNode root, List<Integer> values) {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            TreeNode current = nodes.poll();
            if (current == null) continue;
            System.out.println("Processing node with value: " + current.val);
            values.add(current.val);
            nodes.add(current.left);
            nodes.add(current.right);
        }
    }

}
