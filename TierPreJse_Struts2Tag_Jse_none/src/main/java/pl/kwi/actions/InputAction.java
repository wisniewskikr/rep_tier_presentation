package pl.kwi.actions;

import pl.kwi.services.NameService;

public class InputAction {
	
	
	private String name;
	private NameService nameService;
	
	
	public InputAction() {
		nameService = new NameService();
	}
	
	
	public String displayPage(){
		return "SUCCESS";
	}
	
	public String handleOkButton(){
		nameService.save(name);
		return "SUCCESS";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
