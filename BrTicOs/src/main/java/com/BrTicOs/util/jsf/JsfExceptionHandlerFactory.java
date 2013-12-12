package com.BrTicOs.util.jsf;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

public class JsfExceptionHandlerFactory extends ExceptionHandlerFactory {
	
	private ExceptionHandlerFactory ehf;
	
	public JsfExceptionHandlerFactory(ExceptionHandlerFactory ehf) {
		this.ehf = ehf;
	}
	
	@Override
	public ExceptionHandler getExceptionHandler() {
		return new JsfExceptionHandler(ehf.getExceptionHandler());
	}

}
