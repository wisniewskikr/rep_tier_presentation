package pl.kwi.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import pl.kwi.services.NameService;

//Where pages are located. By default in WEB-INF/content
@Namespace("/")
//How path looks
@ResultPath("/")
public class OutputAction {
	
	
	private String name;
	private NameService nameService;
	
	
	public OutputAction() {
		nameService = new NameService();
	}
	
	
	@Action(value = "outputAction_displayPage", results = {
			@Result(name = "SUCCESS", location = "pages/outputJsp.jsp")
	})
	public String displayPage(){
		name = nameService.load();
		return "SUCCESS";
	}
	
	@Action(value = "outputAction_handleBackButton", results = {
			@Result(name = "SUCCESS", type = "chain", location = "inputAction_displayPage")
	})
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
