package com.greatlearning.lab3.balanceBrackets.service;

import java.util.Stack;

public class BalanceBrackets {

	public boolean areBracketsBalanced(String str) {

		if (str == null || str.isEmpty()) {
			System.out.println("Empty input string");
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			switch (ch) {

			case ')':
				if (stack.pop() != '(') {
					return false;
				}
				break;

			case ']':
				if (stack.pop() != '[') {
					return false;
				}
				break;

			case '}':
				if (stack.pop() != '{') {
					return false;
				}
				break;

			default:
				System.out.println("Invalid input string");
				return false;

			}

		}

		return (stack.isEmpty());
	}
}
