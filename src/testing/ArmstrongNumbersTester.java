package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import logicAndUtility.ArmstrongNumbers;

public class ArmstrongNumbersTester {

	@Test
	public void test1() {
		assertEquals(true, ArmstrongNumbers.checkIfNumberIsArmstrongLike(153));
	}
	
	@Test
	public void test2() {
		assertEquals(false, ArmstrongNumbers.checkIfNumberIsArmstrongLike(111));
	}
	
	@Test
	public void test3() {
		assertEquals(true, ArmstrongNumbers.checkIfNumberIsArmstrongLike(1));
	}
	
	@Test
	public void test4() {
		/*
			according to some sources 0 is a narcistic number too
		*/
		assertEquals(true, ArmstrongNumbers.checkIfNumberIsArmstrongLike(0));
	}
	
	@Test
	public void test5() {
		assertEquals(true, ArmstrongNumbers.checkIfNumberIsArmstrongLike(370));
	}
	
	@Test
	public void test6() {
		assertEquals(true, ArmstrongNumbers.checkIfNumberIsArmstrongLike(-370));
	}
}
