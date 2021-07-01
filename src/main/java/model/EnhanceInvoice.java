/**
 * Purpose : POJO for EnhanceInvoice
 * @author : Sanyukta & Hrishikesh
 * @since : 1/7/2021
 * @Version : 1.0 
 */

package model;

public class EnhanceInvoice {

	public int numberOfRides;
	public double fair;
	public double avgFairPerRide;

	public int getNumberOfRides() {
		return numberOfRides;
	}

	/*
	 * constructor call
	 */
	public EnhanceInvoice(int totalFair, double fair, double avgFairPerRide) {
		this.numberOfRides = totalFair;
		this.fair = fair;
		this.avgFairPerRide = avgFairPerRide;
	}

	public void setNumberOfRides(int numberOfRides) {
		this.numberOfRides = numberOfRides;
	}

	public double getFair() {
		return fair;
	}

	public void setFair(double fair) {
		this.fair = fair;
	}

	public double getAvgFairPerRide() {
		return avgFairPerRide;
	}

	public void setAvgFairPerRide(double avgFairPerRide) {
		this.avgFairPerRide = avgFairPerRide;
	}

}
