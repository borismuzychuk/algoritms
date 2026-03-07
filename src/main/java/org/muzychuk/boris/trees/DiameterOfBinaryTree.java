package org.muzychuk.boris.trees;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        res[0] = 0;
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {
        if (node == null) {
            return 0;
        }
        int leftHeigth = dfs(node.left, res);
        int rightHeigth = dfs(node.right, res);
        res[0] = Math.max(res[0], leftHeigth + rightHeigth);
        return 1 + Math.max(leftHeigth, rightHeigth);
    }

}
