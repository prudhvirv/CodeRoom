package com.practice;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private int ibmPrice;
	private int applePrice;
		
	public StockGrabber() {
		if(observers == null){
			observers = new ArrayList<Observer>();
		}
	}
	
	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o);
	}

	@Override
	public void unRegisterObserver(Observer o) {
		
		int index = observers.indexOf(o);
		observers.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers){
			observer.update(ibmPrice, applePrice);
		}
		
	}

	
	public void setIbmPrice(int price){
		ibmPrice = price;
		notifyObserver();
	}
	
	public void setApplePrice(int price){
		applePrice = price;
		notifyObserver();
	}
	
	
}
