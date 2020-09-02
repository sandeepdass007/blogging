package com.blogging.hackerrank.certification.problemsolving.medium;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;

public class DumbellPairProblem {

	public static void main(String[] args) throws IOException {
		DumbellPairProblem obj = new DumbellPairProblem();
		List<Long> frequency = new ArrayList<Long>();
		/*
		 * Short input for testing;
		 * frequency.add(3);
		 * frequency.add(4);
		 * frequency.add(5);
		 * */
		
		final InputStream resourceAsStream = DumbellPairProblem.class.getResourceAsStream("/com/blogging/hackerrank/certification/problemsolving/medium/custom-input.csv");
		final String csvValues = CharStreams.toString(new InputStreamReader(resourceAsStream, Charsets.UTF_8));
		String[] values = csvValues.split(",");
		for(String val : values) {
			frequency.add(Long.valueOf(val));
		}
		long pairs = obj.compute(frequency);
		System.out.println(pairs);
	}

	private long compute(List<Long> frequency) {
		long pairs = 0L;
		long leftOverDumbellWeight = -1L;
		final int size = frequency.size();
		for(int offset = 0; offset < size; offset++) {
			Long freq = frequency.get(offset);
			if(offset + 1 - leftOverDumbellWeight == 1) {
				pairs++;
				freq--;
				leftOverDumbellWeight = -1L;
			}
			pairs = pairs + (freq / 2);
			final Long mod = freq % 2;
			if(mod != 0 ) {
				leftOverDumbellWeight = offset + 1;
			}
		}
		return pairs;
	}

}
