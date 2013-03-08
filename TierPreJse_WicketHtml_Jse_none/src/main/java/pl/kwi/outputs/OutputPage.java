package pl.kwi.outputs;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.WebPage;

import pl.kwi.inputs.InputPage;
import pl.kwi.services.NameService;

public class OutputPage extends WebPage {
	
	
	private NameService nameService;


    public OutputPage(final PageParameters parameters) {
    	nameService = new NameService();

    	String name = nameService.load();
    	 
		final Label nameLabel = new Label("nameLabel", name);
		
		Form<?> form = new Form<Void>("form") {
			 
			@Override
			protected void onSubmit() { 
				setResponsePage(InputPage.class); 
			}
 
		};
		form.add(nameLabel);

		
		add(form);

    }
}
