package pl.kwi.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import pl.kwi.services.NameService;

@ManagedBean(name = "inputBean")
public class InputBean {
	
	
	@ManagedProperty(value = "#{nameService}")
	private NameService nameService;
	private String name;
	
	
	public void displayPage(){
	}
	
	public String handleButtonOk(){
		nameService.save(name);
		return "/faces/outputXhtml";		
	}
	

	public NameService getNameService() {
		return nameService;
	}
	public void setNameService(NameService nameService) {
		this.nameService = nameService;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
		

	
}