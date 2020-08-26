package com.blogging.datastructures;

public class DoublyLinkedList<T> {

	private int size;
	private Node<T> head;
	private Node<T> tail;
	
	@SuppressWarnings("hiding")
	class Node<T> {
		private Node<T> next;
		private Node<T> prev;
		private T data;
		Node(T data, Node<T> next, Node<T> prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	public void add(T data) {
		addToLast(data);
	}
	
	public boolean addToLast(T data) {
		if(isEmpty()) {
			head = tail = new Node<T>(data, null, null);
		} else {
			tail.next = new Node<T>(data, null, tail);
			tail = tail.next;
		}
		
		size++;
		return true;
	}
	
	public boolean addToFirst(T data) {
		if(isEmpty()) {
			head = tail = new Node<T>(data, null, null);
		} else {
			head.prev = new Node<T>(data, head, null);
			head = head.prev;
		}
		size++;
		return true;
	}
	
	public T peekFirst() {
		if(isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		return head.data;
	}
	
	public T peekLast() {
		if(isEmpty()) {
			throw new RuntimeException("Underflow!");
		}
		return tail.data;
	}
	
	public boolean insertAt(int index, T data) {
		if(index < 0 || index >= size) {
			throw new RuntimeException("IndexOutOfBound");
		}
		if(index == 0) {
			return addToFirst(data);
		}
		
		Node<T> traversalNode = head;
		int offset = 0;
		while(offset < index) {
			traversalNode = traversalNode.next;
			offset++;
		}
		traversalNode.prev = new Node<T>(data, traversalNode, traversalNode.prev);
		return true;
	}
	
	public T itemAt(int index) {
		if(index < 0 || index >= size) {
			throw new RuntimeException("IndexOutOfBound");
		}
		if(index == 0) {
			return peekFirst();
		}
		if(index == size - 1) {
			return peekLast();
		}
		
		Node<T> traversalNode = head;
		int offset = 0;
		while(offset < index) {
			traversalNode = traversalNode.next;
			offset++;
		}
		return traversalNode.data;
	}
	
	public int getSize() {
		return size;
	}
	
	private boolean isEmpty() {
		return size <= 0;
	}
}
