package com.BrTicOs.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;

@Named
@ViewScoped
public class AtendimentoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Integer> tarefas;
	private Date dtHrInicio;
	private Date dtHrFim;
	
	public AtendimentoBean() {
		tarefas = new ArrayList<>();
		tarefas.add(1);
	}
	
	public void handleFileUpload(FileUploadEvent event) {  
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    } 

	public List<Integer> getTarefas() {
		return tarefas;
	}

	public Date getDtHrInicio() {
		return dtHrInicio;
	}

	public void setDtHrInicio(Date dtHrInicio) {
		this.dtHrInicio = dtHrInicio;
	}

	public Date getDtHrFim() {
		return dtHrFim;
	}

	public void setDtHrFim(Date dtHrFim) {
		this.dtHrFim = dtHrFim;
	}

}
