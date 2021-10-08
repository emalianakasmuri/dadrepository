package lab02.app;

import lab02.rounding.RoundingManager;

/**
 * This class demonstrate computing decimal numbers and rounding it to the nearest decimal point.
 * @author emalianakasmuri
 *
 */
public class RoundingApplication {

	public static void main(String[] args) {

		System.out.println("Main entry point of RoundingApplication");
		
		int divident = 200;
		int divisor = 357;
		RoundingManager roundManager = new RoundingManager();
		double value = roundManager.calculatePercentage(divident, divisor);
		
		System.out.println("Progress from " + divisor + "/" + divident + ": " + value + "%");
		
		
		int decimalPoints = 2;
		System.out.println("Round to " + decimalPoints + " decimal points: " 
				+ roundManager.roundValue(value, decimalPoints) + "%");
		
		decimalPoints = 0;
		System.out.println("Round to " + decimalPoints + " decimal points: " 
				+ roundManager.roundValue(value, decimalPoints) + "%");
	}

}
