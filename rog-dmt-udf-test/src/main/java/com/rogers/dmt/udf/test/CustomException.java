package com.rogers.dmt.udf.test;

public class CustomException extends Exception {
    
	public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
	/*
	public CustomException(String message) {
		super(message,null, true, false);
	}*/
}