package com.BrTicOs.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.repository.PapelRepository;
import com.BrTicOs.util.cdi.CDIServiceLocator;

@FacesConverter(forClass = Papel.class)
public class PapelConverter implements Converter {

	PapelRepository papelRepository;

	public PapelConverter() {
		papelRepository = CDIServiceLocator.getBean(PapelRepository.class);
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		Papel papel = null;
		
		if(value != null) {
			
			Long codigo = new Long(value);
			
			papel = papelRepository.byCode(codigo);
		}
		
		return papel;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value != null) {
			return ((Papel) value ).getCodigo().toString();
		}
		
		return "";
	}

}
