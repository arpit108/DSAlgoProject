package com.algo.searchpatterns;

public class Bruteforce {

	public static String patternMatch(String str, String pattern) {

		String index = "";

		int patternLength = pattern.length();
		
		for (int i = 0; i < str.length(); i++) {
			//"ABCDEFGH", "CDE"
			if(patternLength+i<=str.length())
			if (str.substring(i, patternLength+i).equals(pattern)) {
				index += i+"," ;
			}

		}

		return index;

	}

}
