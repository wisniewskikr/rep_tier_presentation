package pl.kwi.actions;

public class InputOkAction {
	
	
	private String nameInput;
	private String nameOutput;
	
	
	public String execute(){
		
		nameOutput = nameInput;
		return "SUCCESS";
		
	}


	public String getNameInput() {
		return nameInput;
	}
	public void setNameInput(String nameInput) {
		this.nameInput = nameInput;
	}

	public String getNameOutput() {
		return nameOutput;
	}
	public void setNameOutput(String nameOutput) {
		this.nameOutput = nameOutput;
	}


}
