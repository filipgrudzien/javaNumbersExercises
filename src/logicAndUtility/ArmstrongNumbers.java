package logicAndUtility;

public class ArmstrongNumbers {

	public static int powerOfCharCounter(char sign, int index) {

		int number = Character.getNumericValue(sign);
		number = (int) Math.pow(number, index);
		return number;
	}

	public static boolean checkIfNumberIsArmstrongLike(int number) {
		
		if( number == 0 || number == 1 ) {
			return true;
		}
		
		if( number < 0 ) {
			number = Math.abs(number);
		}
		
		String convertedNumber = Integer.toString(number);
		
		int result = 0;
		
		for(int i=0; i<convertedNumber.length(); i++) {
			result += powerOfCharCounter(convertedNumber.charAt(i), convertedNumber.length());
		}
		
		if(number == result) {
			return true;
		}
		
		return false;
	}
}
