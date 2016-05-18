package com.interview.designpatterns;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.requestType() == RequestType.CONFERENCE){
			System.out.println("VP can approve conferences");
		}else if(request.requestType() == RequestType.PURCHASES && request.amount() <= 10000){
			System.out.println("VP can approve purchases under 1000");
		}else{
			successor.handleRequest(request);
		}
	}
}
