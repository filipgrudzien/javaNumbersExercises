package logicAndUtility;

public class FibonacciNumbers {
	
	public static int fibonacciNumber(int n) {
		
		if(n <= 1) {
			return n;
		}else {
			return fibonacciNumber(n-1)+fibonacciNumber(n-2);
		}
		
	}
}
