package logicAndUtility;

public class SumOfDigitsOfNumber {
	public static int recursiveSum(int number) {
		if(number/10 == 0) {
			return number;
		}
		return number%10+recursiveSum(number/10);
	}
}
