package test;

// File: FindTargetSumInBST.java

import java.util.HashSet;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class FindTargetSumInBST {

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }

    private boolean dfs(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) return false;

        if (seen.contains(k - node.val)) {
            return true;
        }
        seen.add(node.val);

        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }

    // Example to test the tree
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        FindTargetSumInBST solution = new FindTargetSumInBST();
        System.out.println(solution.findTarget(root, 9)); // Output: true
    }
}

