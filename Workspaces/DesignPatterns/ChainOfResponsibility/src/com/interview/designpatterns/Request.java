package com.interview.designpatterns;

public class Request {

	private RequestType requestType;
	private int amount;
	
	public Request(RequestType requestType, int amount) {
		this.requestType = requestType;
		this.amount = amount;
	}
	
	public RequestType requestType() {
		return requestType;
	}
	
	public int amount() {
		return amount;
	}
}
