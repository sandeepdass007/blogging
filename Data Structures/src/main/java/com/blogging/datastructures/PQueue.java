package com.blogging.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Min Priority Queue
 * Followed youtube video: <a href="https://www.youtube.com/watch?v=RBSGKlAvoiM">(Data Structures Easy to Advanced Course - Full Tutorial from a Google Engineer)</a>
 * @author Taurus
 *
 * @param <T>
 */
public class PQueue <T extends Comparable<T>> {

	private int heapSize = 0;
	
	private int heapCapacity = 0;
	
	private List<T> heap = null;
	
	private Map<T, TreeSet<Integer>> map = new HashMap<T, TreeSet<Integer>>();
	
	public PQueue() {
		this(1);
	}
	
	public PQueue(int size) {
		heap = new ArrayList<T>(size);
	}
	
	public PQueue(T[] elems) {
		heapSize = heapCapacity = elems.length;
		heap = new ArrayList<T>(heapCapacity);
		
		for(int offset = 0; offset < heapSize; offset++) {
			mapAdd(elems[offset], offset);
			heap.add(elems[offset]);
		}
		
		// heapify process, O(n)
		for(int offset = Math.max(0,  (heapSize / 2) - 1); offset >= 0; offset--) {
			sink(offset);
		}
	}
	
	public PQueue(Collection <T> elems) {
		this(elems.size());
		for(T elem : elems) {
			add(elem);
		}
	}
	
	public boolean isEmpty() {
		return heapSize == 0;
	}
	
	public int size() {
		return heapSize;
	}
	
	public T peek() {
		if(isEmpty()) return null;
		return heap.get(0);
	}
	
	public T poll() {
		return removeAt(0);
	}
	
	public boolean contains(T elem) {
		if(elem == null) {
			return false;
		}
		return map.containsKey(elem);
	}
	
	public void add(T elem) {
		if(elem == null) {
			throw new IllegalArgumentException();
		}
		if(heapSize < heapCapacity) {
			heap.set(heapSize, elem);
		} else {
			heap.add(elem);
			heapCapacity++;
		}
		
		mapAdd(elem, heapSize);
		swim(heapSize);
		heapSize++;
	}
	
	private boolean less(int node1index, int node2index) {
		T node1 = heap.get(node1index);
		T node2 = heap.get(node2index);
		return node1.compareTo(node2) <= 0;
	}
	
	// Bottom up node swim, O(log(n))
	private void swim(int k) {
		
		// Grab the index of the next parent node w.r.t to k
		int parent = (k-1) / 2;
		
		while(k > 0 && less(k, parent)) {
			swap(parent, k);
			k = parent;
			
			parent = (k-1) / 2;
		}
	}
	
	// Top down node sink, O(log(n))
	private void sink(int k) {
		while(true) {
			int left = 2 * k + 1; // left node
			int right = 2 * k + 2; // right node
			int smallest = left; // Assume left is the smallest node of the two children
			
			// Find which is smaller; left or right
			// if right is smaller; set smallest to the right
			if(right < heapSize && less(right, left)) {
				smallest = right;
			}
			
			// Stop if we are outside the bounds of the tree
			// or stop early if we cannot sink k anymore
			if(left >= heapSize || less(k, smallest)) {
				break;
			}
			
			// Move down the tree following the smallest node
			swap(smallest, k);
			k = smallest;
		}
	}
	
	private void swap(int index1, int index2) {
		T i_elem = heap.get(index1);
		T j_elem = heap.get(index2);
		
		heap.set(index1, j_elem);
		heap.set(index2, i_elem);
		
		mapSwap(i_elem, j_elem, index1, index2);
	}
	
	private T removeAt(int index) {
		if(isEmpty()) {
			return null;
		}
		heapSize--;
		T removed_data = heap.get(index);
		swap(index, heapSize);
		
		heap.set(heapSize, null);
		mapRemove(removed_data, heapSize);
		
		if(index == heapSize) {
			return removed_data;
		}
		
		T elem = heap.get(index);
		
		// Try sinking element
		sink(index);
		
		if(heap.get(index).equals(elem)) {
			swim(index);
		}
		
		return removed_data;
	}
	
	private void mapAdd(T value, int index) {
		TreeSet<Integer> set = map.get(value);
		
		if(set == null) {
			set = new TreeSet<Integer>();
			set.add(index);
			map.put(value, set);
		} else {
			set.add(index);
		}
	}
	
	private void mapRemove(T value, int index) {
		TreeSet<Integer> set = map.get(value);
		set.remove(index);
		if(set.size() == 0) {
			map.remove(value);
		}
	}
	
	private void mapSwap(T val1, T val2, int val1Index, int val2Index) {
		Set<Integer> set1 = map.get(val1);
		Set<Integer> set2 = map.get(val2);
		
		set1.remove(val1Index);
		set2.remove(val2Index);
		
		set1.add(val2Index);
		set2.add(val1Index);
	}
}
