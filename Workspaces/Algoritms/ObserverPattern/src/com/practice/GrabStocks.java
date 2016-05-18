package com.practice;

public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber grabber = new StockGrabber();
		
		StockObserver stockObserver = new StockObserver(grabber);
		
		grabber.setApplePrice(100);
		grabber.setApplePrice(700);
		grabber.setIbmPrice(200);
		grabber.setApplePrice(1680);
		grabber.setIbmPrice(2050);
		grabber.setApplePrice(630);
		grabber.setIbmPrice(254325);
		grabber.setIbmPrice(245);
		grabber.setIbmPrice(8979);
		grabber.setApplePrice(2435);
		grabber.setIbmPrice(4554);
		grabber.setIbmPrice(24235);

	}

}
