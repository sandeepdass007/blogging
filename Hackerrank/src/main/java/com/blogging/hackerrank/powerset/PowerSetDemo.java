package com.blogging.hackerrank.powerset;

import java.util.HashSet;

public class PowerSetDemo {

	public static void main(String[] args) {
		int[] set = new int[] {1,2,3,4,5};
		generatePowerSet(set);
	}
	
	private static void generatePowerSet(int[] set) {
		HashSet<String> powerSet = new HashSet<String>();
		powerSet.add("{}");
		for(int val : set) {
			HashSet<String> localPowerSet = new HashSet<String>();
			localPowerSet.add(String.format("{%d}", val));
			powerSet.forEach(setVal -> {
				if(!setVal.equals("{}")) {
					final String prefix = setVal.substring(0, setVal.length() - 1);
					localPowerSet.add(prefix + "," + val + "}");
				}
			});
			powerSet.addAll(localPowerSet);
		}
		powerSet.forEach(System.out::println);
	}

}
