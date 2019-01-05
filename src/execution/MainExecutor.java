package execution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import logicAndUtility.FibonacciNumbers;
import logicAndUtility.SumOfDigitsOfNumber;
import testing.ArmstrongNumbersTester;
import testing.NumericPalindromeTester;
import testing.PowerOfTwoTester;

public class MainExecutor {

	public static void powerOfTwoRun() {

		Result result = JUnitCore.runClasses(PowerOfTwoTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}

	public static void numericPalindromeRun() {

		Result result = JUnitCore.runClasses(NumericPalindromeTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}

	public static void armstrongNumberRun() {

		Result result = JUnitCore.runClasses(ArmstrongNumbersTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}

	public static void main(String[] args) {
		powerOfTwoRun();
		numericPalindromeRun();
		armstrongNumberRun();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Fibonacci number " + i + ": " + FibonacciNumbers.fibonacciNumber(i));
		}
		int example = 123;
		int result = SumOfDigitsOfNumber.recursiveSum(123);
		System.out.println("Sums of digits: " + result);
	}

}
