package com.bridgelabz.cabInvoice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	private final double COST_PER_KM =10;
	private final double COST_PER_MIN =1;
	private final double DELTA = 0.0;
	
	CabInvoiceGenerator invoicegenerator = null;
	@Before
	public void setUp() {
		invoicegenerator = new CabInvoiceGenerator();
	}
	
	@Test
	public void given_DistanceAndTime_ShouldReturnTotalFair() {
		double distance = 12;
		double time = 5;
		double totalFair = invoicegenerator.generateFair(distance , time);
		Assert.assertEquals(125.0, totalFair,DELTA);
	}

}
