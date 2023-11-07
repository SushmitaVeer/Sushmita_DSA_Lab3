package com.greatlearning.lab3.findingPair.service;

import java.util.HashSet;
import java.util.Set;

public class FindingPair {

	public void checkPairPresent(TreeNode root, int sum) {
		Set<Integer> set = new HashSet<>();
		if (!isPairPresent(root, sum, set)) {
			System.out.println("Pair not Found for given Sum : " + sum);
		}
	}

	private boolean isPairPresent(TreeNode root, int sum, Set<Integer> sets) {

		if (root == null) {
			return false;
		}

		if (isPairPresent(root.left, sum, sets)) {
			return true;
		}

		if (sets.contains(sum - root.data)) {
			System.out.println("Pair is (" + root.data + ", " + (sum - root.data) + ")");
			return true;
		}

		else {
			sets.add(root.data);
		}

		return isPairPresent(root.right, sum, sets);
	}
}
