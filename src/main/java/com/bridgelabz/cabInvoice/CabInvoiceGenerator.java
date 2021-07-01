/**
 * Purpose : To Perform the CabInVoice generator
 * @author : Sanyukta & Hrishikesh
 * @since : 1/7/2021
 * @Version : 1.0 
 */

package com.bridgelabz.cabInvoice;

public class CabInvoiceGenerator {

	private final double COST_PER_KM = 10;
	private final double COST_PER_MIN = 1;
	private final double MIN_FAIR = 5.0;

	/**
	 * @param distance  
	 * @param time
	 * @return calculate totalFair or minFair
	 */
	public double generateFair(double distance, double time) {

		double totalFair = 0.0;
		totalFair = distance * COST_PER_KM + time * COST_PER_MIN;

		if (totalFair < MIN_FAIR) {
			return MIN_FAIR;
		} else {
			return totalFair;
		}

	}

}
