package com.staples.calc.helpers;

public class MathHelper {
	public static double addValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 + d2;
		return result;
	}
	
	public static double multiplyValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 * d2;
		return result;
	}
	
	public static double divideValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 / d2;
		return result;
	}
	
	public static double subtractValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 - d2;
		return result;
	}
	
	public static double addMultipleValues(double ... values){
		double result = 0d;
		for (double d : values) {
			result += d;
		}
		return result;
	}
}
