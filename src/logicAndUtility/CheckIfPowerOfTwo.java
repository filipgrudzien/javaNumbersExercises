package logicAndUtility;

public class CheckIfPowerOfTwo {

	public static boolean powerOf2Checking(int number) {

		if (number == 0) {
			return false;
		}

		if (number < 0) {
			number = Math.abs(number);
		}

		if (number == 1) {
			return true;
		}

		int tmpPowerOfTwo = 2;

		while (tmpPowerOfTwo <= number) {

			if (tmpPowerOfTwo == number) {
				return true;
			}
			tmpPowerOfTwo *= 2;
		}

		return false;
	}
}
