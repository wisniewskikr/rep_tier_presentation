package pl.kwi.applications;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import pl.kwi.inputs.InputPage;
import pl.kwi.outputs.OutputPage;

public class Application extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return InputPage.class; //return default page
	}

}
