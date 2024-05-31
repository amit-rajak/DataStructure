package com.Test;

// Improved Code

import java.util.*;

import java.util.*;

 class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class mainClass {
    public static TreeNode buildTree(String[] strArr) {
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        // Parse the pairs and build the nodes
        for (String pair : strArr) {
            String[] nodes = pair.replaceAll("[()]", "").split(",");
            int child = Integer.parseInt(nodes[0]);
            int parent = Integer.parseInt(nodes[1]);

            nodeMap.putIfAbsent(child, new TreeNode(child));
            nodeMap.putIfAbsent(parent, new TreeNode(parent));

            TreeNode parentNode = nodeMap.get(parent);
            TreeNode childNode = nodeMap.get(child);

            // Assuming binary tree for simplicity
            if (parentNode.left == null) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

            children.add(child);
        }

        // Find the root (a node that is not a child)
        for (Integer id : nodeMap.keySet()) {
            if (!children.contains(id)) {
                return nodeMap.get(id); // Root found
            }
        }

        return null; // No root found
    }

    public static void main(String[] args) {
        String[] strArr = {"(1,2)", "(2,4)", "(7,2)"};
        TreeNode root = buildTree(strArr);
        // Add code to traverse and print the tree if needed
    }
}
