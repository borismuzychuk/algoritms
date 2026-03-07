package org.muzychuk.boris.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch {

    public List<Integer> traverse(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        dsf(root, values);
        return values;
    }

    public List<Integer> iterativeTraverse(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        iterativeDsf(root, values);
        return values;
    }

    private void dsf(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        System.out.println("Processing node with val: " + node.val);
        values.add(node.val);
        dsf(node.left, values);
        dsf(node.right, values);
    }

    private void iterativeDsf(TreeNode node, List<Integer> values) {
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current == null) continue;
            System.out.println("Processing node with val: " + current.val);
            values.add(current.val);
            stack.push(current.right);
            stack.push(current.left);
        }
    }


}
