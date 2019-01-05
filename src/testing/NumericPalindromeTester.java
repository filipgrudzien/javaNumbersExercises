package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import logicAndUtility.NumericPalindrome;

public class NumericPalindromeTester {

	@Test
	public void test1() {
		assertEquals(false, NumericPalindrome.checkIfNumberIsPalindrome(2));
	}
	
	@Test
	public void test2() {
		assertEquals(true, NumericPalindrome.checkIfNumberIsPalindrome(121));
	}
	
	@Test
	public void test3() {
		/*
			assuming that negative number are being handled by obtaining their absolute value
		*/
		assertEquals(true, NumericPalindrome.checkIfNumberIsPalindrome(-121));
	}
	
	@Test
	public void test4() {
		assertEquals(true, NumericPalindrome.checkIfNumberIsPalindrome(1111));
	}
	
	@Test
	public void test5() {
		assertEquals(false, NumericPalindrome.checkIfNumberIsPalindrome(24567));
	}
}
