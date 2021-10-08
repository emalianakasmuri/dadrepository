package lab02.rounding;

import java.text.DecimalFormat;

public class RoundingManager {
	
	/**
	 * This method calculates percentage from dividend and divisor
	 * @param dividiend
	 * @param divisor
	 * @return
	 */
	public double calculatePercentage (int dividend, int divisor) {
		
		double percentage = ((double)dividend / (double)divisor) * 100;
		
		return percentage;
	}
	
	/**
	 * This method rounds the value to the requested decimal points
	 * @param value
	 * @param decimalPoints
	 * @return
	 */
	public String roundValue(double value, int decimalPoints) {
		
		// Generate decimal points
		String decimalPlaces = ".";
		
		for (int counter = 0; counter < decimalPoints; counter++)
			decimalPlaces += "0";
		
		if (decimalPoints == 0)
			decimalPlaces = "";
		
		DecimalFormat formatter = new DecimalFormat("###" + decimalPlaces);
		
		
		return formatter.format(value);
	}

}
