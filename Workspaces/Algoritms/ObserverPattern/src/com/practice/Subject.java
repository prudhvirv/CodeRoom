package com.practice;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void unRegisterObserver(Observer o);
	public void notifyObserver();
}
