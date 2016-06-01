package com.algo.searchpatterns;

import org.junit.Test;

public class BruteForceTest {

	@Test
	public void testPatternMatch()
	{
		
		String index=Bruteforce.patternMatch("ABCDEFGH", "CDE");
		
		System.out.println("Found pattern at Index= "+index);
		
		
		index=Bruteforce.patternMatch("ABCDEFGHCDE", "CDE");
		System.out.println("Found pattern at Index= "+index);
		
		
		
	}
	
}
