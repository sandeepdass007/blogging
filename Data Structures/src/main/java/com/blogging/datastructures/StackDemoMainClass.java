package com.blogging.datastructures;

import java.util.HashMap;

public class StackDemoMainClass {
	
	private HashMap<Character, Character> bracketMap = new HashMap<Character, Character>()
	{
		private static final long serialVersionUID = 1151095932282854562L;
		{
			put('{', '}');
			put('[', ']');
			put('(', ')');
		}
	};

	public static void main(String[] args) {
		final String brackets = "{[]()}";
		System.out.println(new StackDemoMainClass().isBracketSequenceValid(brackets));
	}
	
	private boolean isBracketSequenceValid(final String brackets) {
		if(brackets.isEmpty() || brackets.length() == 0) {
			throw new RuntimeException("Invalid brackets input!");
		}
		Stack<Character> stack = new Stack<Character>();
		for(char bracket : brackets.toCharArray()) {
			if(isLeftBracket(bracket)) {
				stack.push(bracket);
				continue;
			}
			if(getReverseBracket(stack.pop()) != bracket) {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	private char getReverseBracket(char bracket) {
		return bracketMap.get(bracket);
	}
	
	private boolean isLeftBracket(char bracket) {
		return bracketMap.keySet().contains(bracket);
	}
}
