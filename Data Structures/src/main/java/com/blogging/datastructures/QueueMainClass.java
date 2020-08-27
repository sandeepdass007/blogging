package com.blogging.datastructures;

public class QueueMainClass {

	public static void main(String[] args) {
		QueueMainClass obj = new QueueMainClass();
		obj.test();
	}

	private void test() {
		Queue<String> queue = new Queue<String>();
		queue.enqueue("Sandeep");
		queue.enqueue("Dass");
		queue.enqueue("Aman");
		queue.enqueue("Kaur");
		queue.enqueue("Ojus");
		queue.enqueue("Nikita");
		queue.dequeue();
		queue.dequeue();
		System.out.println("Peeking First: " + queue.peek());
		for(int offset = 0; offset < queue.getSize(); offset++) {
			System.out.println(queue.getItem(offset));
		}
	}

}
