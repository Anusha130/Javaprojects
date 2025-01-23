package com.cap.ServiceEurekhaDemo.exception;

public class ResourceNotFoundException extends RuntimeException {
	public  ResourceNotFoundException(String message) {
		super(message);
	}
	
	public  ResourceNotFoundException() {
		super("resource not found yet");
	}
}
