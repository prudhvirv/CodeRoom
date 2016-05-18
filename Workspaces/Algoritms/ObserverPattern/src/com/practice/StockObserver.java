package com.practice;

public class StockObserver implements Observer {

	private int ibmPrice; 
	private int applePrice; 
	
	Subject stockGrabber;
	
	
	public StockObserver(Subject stkGrabber) {
		
		stockGrabber = stkGrabber;
		stockGrabber.registerObserver(this);
		
		
	}
	
	
	@Override
	public void update(int ibmPrice, int applePrice) {
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		
		printPrices();
	}

	
	private void printPrices(){
		System.out.println("IBM Price : "+ibmPrice);
		System.out.println("Apple Price : "+applePrice);
	}
	
}
