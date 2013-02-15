package pl.kwi.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "inputOutputBean")
public class InputOutputBean {
	
	
	private String name;
	private String output;
	
	
	public void displayPage(){
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutput() {
		output = getName();
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}	
		
	
}