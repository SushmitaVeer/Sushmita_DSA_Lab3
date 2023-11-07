package com.greatlearning.lab3.balanceBrackets.driver;

import com.greatlearning.lab3.balanceBrackets.service.BalanceBrackets;

public class BracketsMain {

	public static void main(String[] args) {

		BalanceBrackets brackets = new BalanceBrackets();

		String input1 = "([[{}]])";
		String input2 = "([[{}]]))";

		if (brackets.areBracketsBalanced(input1)) {
			System.out.println("Input 1 : " + input1);
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("Input 1 : " + input1);
			System.out.println("The entered String does not have Balanced Brackets");
		}

		if (brackets.areBracketsBalanced(input2)) {
			System.out.println("Input 2 : " + input2);
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("Input 2 : " + input2);
			System.out.println("The entered String does not have Balanced Brackets");
		}
	}

}
