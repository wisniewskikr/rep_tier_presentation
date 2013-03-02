package pl.kwi.actions;

import pl.kwi.services.NameService;

public class OutputAction {
	
	
	private String name;
	private NameService nameService;
	
	
	public OutputAction() {
		nameService = new NameService();
	}
	
	
	public String displayPage(){
		name = nameService.load();
		return "SUCCESS";
	}
	
	public String handleBackButton(){
		return "SUCCESS";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
