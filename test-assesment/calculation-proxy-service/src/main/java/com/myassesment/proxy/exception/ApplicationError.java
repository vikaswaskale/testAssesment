package com.myassesment.proxy.exception;

public class ApplicationError extends RuntimeException {

	/**
	 * Handle Error if the product is not available for any reason
	 */
	private static final long serialVersionUID = 1L;
	private EceptionMessge exceptionMessge ;

	public ApplicationError(EceptionMessge exceptionMessge) {
 
		this.exceptionMessge = exceptionMessge;
	}

	public EceptionMessge getErrorMessage() {
		return exceptionMessge;
	}

	public void setErrorMessage(EceptionMessge errorMessage) {
		this.exceptionMessge = exceptionMessge;
	}

	
}
