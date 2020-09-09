package com.blogging.algorithm;

import java.util.Stack;

public class InfixToPostfixConversion {

	public static void main(String[] args) {
		final String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(String.format("Infix Expression: %s", infixExpression));
		final String postfixExpression = getPostfixExpression(infixExpression);
		System.out.println(String.format("Postfix Expression: %s", postfixExpression));
	}

	private static String getPostfixExpression(String infixExpression) {
		StringBuilder outputStringBuilder = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		if(infixExpression.charAt(0) != '(') {
			stack.push('(');
		}
		for(char ch : infixExpression.toCharArray()) {
			if(isOperator(ch)) {
				if(isClosingBracket(ch)) {
					// pop items until opening bracket encounters
					while(true) {
						char operand = stack.pop();
						if(isOpeningBracket(operand)) {
							break;
						}
						outputStringBuilder.append(operand);
					}
				} else if(isLowerOrEqualPrecendenceThanStackPeek(stack, ch)) {
					while(true) {
						if(isLowerOrEqualPrecendenceThanStackPeek(stack, ch)) {
							outputStringBuilder.append(stack.pop());
							continue;
						}
						break;
					}
					stack.push(ch);
				} else {
					stack.push(ch);
				}
			} else {
				outputStringBuilder.append(ch);
			}
		}
		stack.forEach(ch -> {
			if(!isOpeningBracket(ch)) {
				outputStringBuilder.append(ch);
			}
		});
		return outputStringBuilder.toString();
	}
	
	private static boolean isLowerOrEqualPrecendenceThanStackPeek(Stack<Character> stack, char ch) {
		if(ch == '(' || ch == ')') {
			return false;
		}
		return getOperatorPriority(stack.peek()) >= getOperatorPriority(ch);
	}
	
	private static int getOperatorPriority(char ch) {
		switch(ch) {
		case '^':
			return 3;
		case '*':
			return 2;
		case '/':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return 0;
	}

	private static boolean isOperator(char ch) {
		return ch == '*' || ch == '+' || ch == '/' || ch == '^' || ch == '-' || ch == '(' || ch == ')';
	}
	
	private static boolean isClosingBracket(char ch) {
		return ch == ')';
	}
	
	private static boolean isOpeningBracket(char ch) {
		return ch == '(';
	}

}
