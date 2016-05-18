package com.interview.designpatterns;

public abstract class Handler {

	Handler successor;
	
	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(Request request);
}
