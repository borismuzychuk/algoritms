package org.muzychuk.boris.trees;

import java.util.LinkedList;
import java.util.Queue;

public class InversionBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> treeNodesQueue = new LinkedList<>();
        treeNodesQueue.add(root);
        while (!treeNodesQueue.isEmpty()) {
            TreeNode node = treeNodesQueue.poll();
            TreeNode tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;
            if (node.left != null) {
                treeNodesQueue.add(node.left);
            }
            if (node.right != null) {
                treeNodesQueue.add(node.right);
            }
        }
        return root;
    }

}
