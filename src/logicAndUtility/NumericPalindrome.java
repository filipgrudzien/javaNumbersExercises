package logicAndUtility;

public class NumericPalindrome {
	
	public static boolean checkIfNumberIsPalindrome(int number) {
		
		if( number < 1 ) {
			number = Math.abs(number);
		}
		
		String convertedNumber = Integer.toString(number);
		
		if( convertedNumber.length()== 1 ) {
			return false;
		}
		
		String possiblePalindrome = new StringBuffer(convertedNumber).reverse().toString();
		
		if ( convertedNumber.equals(possiblePalindrome) ) {
			return true;
		}
		
		return false;
	}
}
