package pl.kwi.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import pl.kwi.services.NameService;

// Where pages are located. By default in WEB-INF/content
@Namespace("/")
// How path looks
@ResultPath("/")
public class InputAction {
	
	
	private String name;
	private NameService nameService;
	
	
	public InputAction() {
		nameService = new NameService();
	}
	
	@Action(value = "inputAction_displayPage", results = {
			@Result(name = "SUCCESS", location = "pages/inputJsp.jsp")
	})
	public String displayPage(){
		return "SUCCESS";
	}
	
	@Action(value = "inputAction_handleOkButton", results = {
			@Result(name = "SUCCESS", type = "chain", location = "outputAction_displayPage")
	})
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
