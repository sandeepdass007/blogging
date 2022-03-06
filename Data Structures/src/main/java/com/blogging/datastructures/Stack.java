package com.blogging.datastructures;

import java.util.LinkedList;

public class Stack<T> {

	LinkedList<T> linkedList = new LinkedList<T>();
	
	public Stack(){}
	
	public Stack(T item) {
		linkedList.addLast(item);
	}
	
	public void push(T item) {
		linkedList.addLast(item);
	}
	
	public T pop() {
		if(linkedList.isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		return linkedList.removeLast();
	}
	
	public T peek() {
		if(linkedList.isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		return linkedList.getLast();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
}
