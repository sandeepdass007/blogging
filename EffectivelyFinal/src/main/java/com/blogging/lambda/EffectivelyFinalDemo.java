package com.blogging.lambda;

import java.util.Arrays;
import java.util.List;

public class EffectivelyFinalDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int evenNumbersCount = 0;
		numbers.forEach(number -> {
			if(number % 2 == 0) {
//				evenNumbersCount++; // compile time error
			}
		});
	}
}
