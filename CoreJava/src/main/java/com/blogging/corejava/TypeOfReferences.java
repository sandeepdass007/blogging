package com.blogging.corejava;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import com.blogging.model.Employee;

public class TypeOfReferences {

	public static void main(String[] args) throws InterruptedException {
		TypeOfReferences typeOfReferences = new TypeOfReferences();
		System.out.println("Testing Strong References...");
		typeOfReferences.strongReferences();
		System.out.println("Testing Weak References...");
		typeOfReferences.weakReferences();
		System.out.println("Testing Soft References...");
		typeOfReferences.softReferences();
	}

	private void strongReferences() {
		Employee employee = new Employee(24, "John", null, "Martino"); // Strong reference
		System.out.println(employee);
		employee = null; // reference removed hence eligible for garbage collection
		// following statement would throw NullPointerException as reference to object
		// doesn't exist
		// System.out.println(employee);
	}

	private void weakReferences() {
		Employee employee = new Employee(24, "John", null, "Martino"); // Strong reference
		WeakReference<Employee> weakReference = new WeakReference<Employee>(employee); // Strong reference
		/*
		 * employee reference to object is pointing to null which means it is eligible
		 * for garbage collection. But it may be a case that we need that object (i.e.
		 * employee object) back assuming it is not garbage collected yet. We can do
		 * that using
		 */
		employee = null;
		// initiate the garbage collection
		System.gc();
		/*
		 * Highly expected that till now the object is garbage collected if System.gc();
		 * is not commented. Otherwise there are chances that object is still present
		 * and can be retrieved. Try to check the output by commenting/uncommenting
		 * above statement.
		 */
		System.out.println(weakReference.get());
	}

	private void softReferences() {
		Employee employee = new Employee(24, "John", null, "Martino"); // Strong reference
		SoftReference<Employee> softReference = new SoftReference<Employee>(employee); // Strong reference
		/*
		 * employee reference to object is pointing to null which means it is eligible
		 * for garbage collection. But in this case it will be ignored by the Garbage
		 * Collector because we marked it as SoftReference which means GC would ignore
		 * it in its regular garbage collection and would remove soft references only
		 * when memory is running out of space.
		 */
		employee = null;
		// initiate the garbage collection
		System.gc();
		/*
		 * Even if we invoked the garbage collection, soft reference would still be
		 * there and would be removed only when JVM runs out of memory.
		 */
		System.out.println(softReference.get());
	}

}
