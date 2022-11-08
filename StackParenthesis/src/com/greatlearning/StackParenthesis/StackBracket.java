package com.greatlearning.StackParenthesis;

import java.util.Stack;

public class StackBracket {
	private static boolean checkBracket(String input) {
		Stack<Character> stack = new Stack<>();
		char k;
		for (int i = 0; i < input.length(); i++) {
			k = input.charAt(i);
			if (k == '[' || k == '{' || k== '(') {
				stack.push(k);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char z;
			switch (k) {
			case ']':
				z = stack.pop();
				if (z == '{' || z == '(') {
					return false;
				}
				break;
			case '}':
				z = stack.pop();
				if (z == '(' || z == '[') {
					return false;
				}
				break;
			case ')':
				z = stack.pop();
				if (z == '{' || z == '[') {
					return false;
				}
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		String input = "{[()]}";
		boolean result = checkBracket(input);
		if (result) {
			System.out.println("Valid Input");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
