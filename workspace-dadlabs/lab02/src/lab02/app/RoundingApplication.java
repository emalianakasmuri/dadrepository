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
		
		RoundingManager roundManager = new RoundingManager();
		double value = roundManager.calculatePercentage(200, 350);
		
		System.out.println("Value from 350/200 : " + value);
		
		System.out.println("Round to 2 decimal points: " + roundManager.roundValue(value, 0));
	}

}
