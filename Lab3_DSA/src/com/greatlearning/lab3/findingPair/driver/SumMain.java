package com.greatlearning.lab3.findingPair.driver;

import com.greatlearning.lab3.findingPair.service.FindingPair;
import com.greatlearning.lab3.findingPair.service.TreeNode;

public class SumMain {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(40);
		root.insertNode(root, 20);
		root.insertNode(root, 60);
		root.insertNode(root, 10);
		root.insertNode(root, 30);
		root.insertNode(root, 50);
		root.insertNode(root, 70);

		FindingPair pair = new FindingPair();
		pair.checkPairPresent(root, 130);

	}

}
