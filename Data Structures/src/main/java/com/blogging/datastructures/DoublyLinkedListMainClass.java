package com.blogging.datastructures;

public class DoublyLinkedListMainClass {

	public static void main(String[] args) {
		DoublyLinkedList<String> dList = new DoublyLinkedList<String>();
		dList.add("Sandeep");
		dList.add("Amandeep");
		dList.add("Ravish");
		dList.add("Jatinder");
		dList.insertAt(0, "Nehal");
		int size = dList.getSize();
		for(int offset = 0; offset < size; offset++) {
			System.out.println(dList.itemAt(offset));
		}
	}

}
