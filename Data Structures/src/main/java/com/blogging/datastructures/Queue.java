package com.blogging.datastructures;

import java.util.LinkedList;

public class Queue<T> {

	private LinkedList<T> list = new LinkedList<T>();
	
	public Queue() {}
	
	public Queue(T data) {
		enqueue(data);
	}
	
	public void enqueue(T data) {
		list.addLast(data);
	}
	
	public T dequeue() {
		if(list.isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public int getSize() {
		return list.size();
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		return list.peekFirst();
	}
	
	public T getItem(int index) {
		if(isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		
		if(index >= getSize()) {
			throw new RuntimeException("IndexOutOfBound!");
		}
		return list.get(index);
	}
}
