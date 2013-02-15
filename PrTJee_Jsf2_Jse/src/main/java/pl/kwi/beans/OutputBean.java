package pl.kwi.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import pl.kwi.services.NameService;

@ManagedBean(name = "outputBean")
public class OutputBean {
	
	
	@ManagedProperty(value = "#{nameService}")
	private NameService nameService;
	private String name;
	
	
	public void displayPage(){
		name = nameService.load();
	}
	
	public String handleButtonBack(){		
		return "/faces/inputXhtml";		
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