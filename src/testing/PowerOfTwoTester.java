package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import logicAndUtility.CheckIfPowerOfTwo;

public class PowerOfTwoTester {

	@Test
	public void test1() {
		assertEquals(true, CheckIfPowerOfTwo.powerOf2Checking(2));
	}
	
	@Test
	public void test2() {
		assertEquals(false, CheckIfPowerOfTwo.powerOf2Checking(3));
	}
	
	@Test
	public void test3() {
		/*
			assuming, that we handle negative numbers by obtaining theirs absolute value	
			also assuming that power 2^0 = 1
		*/
		assertEquals(true, CheckIfPowerOfTwo.powerOf2Checking(-1));
	}
	
	@Test
	public void test4() {
		/*
			assuming, that we handle negative numbers by obtaining theirs absolute value	
			also assuming that power 2^0 = 1
		*/
		assertEquals(false, CheckIfPowerOfTwo.powerOf2Checking(0));
	}
}
