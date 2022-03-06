package com.blogging.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utility {

	public static void main(String[] args) {
		System.out.println(formatBytes(10000000000000l, 2));
	}

	public static String formatBytes(long bytes, int decimals) {
		if (bytes == 0)
			return "0 Byte(s)";
		final int k = 1024;
		final int decimalPlaces = decimals < 0 ? 0 : decimals;
		final String[] sizes = new String[] { "Byte(s)", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB" };
		final double i = Math.floor(Math.log(bytes) / Math.log(k));
		double formattedByteValue = bytes / Math.pow(k, i);
		if (decimalPlaces == 0) {
			formattedByteValue = Math.ceil(formattedByteValue);
			return (long) formattedByteValue + sizes[(int) i];
		}
		return round(formattedByteValue, decimalPlaces) + sizes[(int) i];
	}

	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();
		BigDecimal bd = BigDecimal.valueOf(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
