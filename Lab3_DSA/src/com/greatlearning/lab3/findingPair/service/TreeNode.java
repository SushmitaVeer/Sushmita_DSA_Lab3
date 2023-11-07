package com.greatlearning.lab3.findingPair.service;

public class TreeNode {
	int data;
	TreeNode left, right;

	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		if (data < root.data) {
			root.left = insertNode(root.left, data);
		} else {
			root.right = insertNode(root.right, data);
		}
		return root;
	}
}
