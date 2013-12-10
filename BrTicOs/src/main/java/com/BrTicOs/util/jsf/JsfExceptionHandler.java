package com.BrTicOs.util.jsf;

import java.io.IOException;
import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.ViewExpiredException;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

public class JsfExceptionHandler extends ExceptionHandlerWrapper {

	private ExceptionHandlerWrapper wrapped;

	public JsfExceptionHandler(ExceptionHandlerWrapper wrapped) {
		this.wrapped = wrapped;
	}

	@Override
	public ExceptionHandler getWrapped() {
		return wrapped;
	}

	public void handle() throws FacesException {
		Iterator<ExceptionQueuedEvent> events = getUnhandledExceptionQueuedEvents()
				.iterator();

		while (events.hasNext()) {

			ExceptionQueuedEvent event = events.next();
			// a origem da excecao
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event
					.getSource();

			Throwable exception = context.getException();

			
			try {
				if (exception instanceof ViewExpiredException) {
					redirect("/");
				}
			} finally {
				events.remove();
			}
		}
		getWrapped().handle();
	}

	private void redirect(String page) {
		
		try {
			FacesContext fc = FacesContext.getCurrentInstance();
			// contexto da aplicacao, url padrao
			ExternalContext ec = fc.getExternalContext();

			String cp = ec.getRequestContextPath();
			ec.redirect(cp + page);
			fc.responseComplete();
		} catch (IOException e) {
			throw new FacesException(e);
		}

	}

}
