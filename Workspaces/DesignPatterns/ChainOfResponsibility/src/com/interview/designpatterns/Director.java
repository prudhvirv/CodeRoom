package com.interview.designpatterns;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		
		if(request.requestType() == RequestType.AWARDS){
			System.out.println("Director can give away awards");
		}else {
			successor.handleRequest(request);
		}
	}
}