package com.BrTicOs.util.jsf;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class JsfExceptionHandleFactory extends ExceptionHandlerFactory {
	
	private ExceptionHandlerFactory ehf;
	
	public JsfExceptionHandleFactory(ExceptionHandlerFactory ehf) {
		this.ehf = ehf;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		return new JsfExceptionHandler(ehf.getExceptionHandler());
	}

}
