package com.blogging.hackerrank.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		List<Integer> arrayAsList = Arrays.asList(1, 2, 3, 4, 5);
		final List<Integer> rotatedList = rotateLeft(9, arrayAsList);
		rotatedList.forEach(System.out::println);
	}

	public static List<Integer> rotateLeft(int rotations, List<Integer> arr) {
		List<Integer> rotatedList = new ArrayList<Integer>();

		for (int offset = 0; offset < arr.size(); offset++) {
			int rotatedValue = getRotatedValue(offset, arr, rotations);
			rotatedList.add(rotatedValue);
		}
		return rotatedList;
	}

	private static int getRotatedValue(int offset, List<Integer> arr, int rotations) {
		int rotatedValueIndex = offset + rotations;
		if (rotatedValueIndex >= arr.size()) {
			rotatedValueIndex %= arr.size();
		}
		return arr.get(rotatedValueIndex);
	}
	
	// below code is from hackerrank
	
	/*public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }*/
}
