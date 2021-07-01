package com.bridgelabz.cabInvoice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.EnhanceInvoice;
import model.Rides;

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
		double time = 6;
		double totalFair = invoicegenerator.generateFair(distance , time);
		Assert.assertEquals(126.0, totalFair,DELTA);
	}

   
	@Test
	public void given_DistanceAndTime_WhentotalFairIsLessThenMinFair_ShouldReturnFalse() {
		double distance = 0.2;
		double time = 0.1;
		double totalFair = invoicegenerator.generateFair(distance , time);
		Assert.assertNotEquals(2.1, totalFair);;
	}
	
	@Test
	public void given_DistanceAndTime_ForMultipleRides_ShouldReturnTotalFair() {
		List<Rides> rideList = new ArrayList<>();
		rideList.add(new Rides(12.0,6.0));
		rideList.add(new Rides(10,5));
		rideList.add(new Rides(0.11,0.6));
		double totalFair = invoicegenerator.calcFairForMultipleRides(rideList);
		Assert.assertEquals(232.7,totalFair,DELTA);
		
	}
	
	@Test
	public void given_DistanceAndTime_ForMultipleRides_ShouldReturnEnhanceInvoice() {
		List<Rides> rideList = new ArrayList<>();
		rideList.add(new Rides(12.0,6.0));
		rideList.add(new Rides(10,5));
		rideList.add(new Rides(0.11,0.6));
		
		EnhanceInvoice enhanceinvoice = new EnhanceInvoice (3, 232.7, 79.1);
		
		EnhanceInvoice enhancetest = invoicegenerator.generateEnhanceInvoice(rideList);
		
		
	}
	
}
