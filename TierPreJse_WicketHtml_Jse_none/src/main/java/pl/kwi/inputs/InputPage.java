package pl.kwi.inputs;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

import pl.kwi.outputs.OutputPage;
import pl.kwi.services.NameService;

public class InputPage extends WebPage {
	
	
	private NameService nameService;
	
	
	
	public InputPage(final PageParameters parameters) {
		nameService = new NameService();
		 
		final TextField<String> nameField = new TextField<String>("nameField", Model.of(""));
		 
		Form<?> form = new Form<Void>("form") {
 
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit() {
 
				final String name = nameField.getModelObject();
				nameService.save(name);
 
				setResponsePage(OutputPage.class);
 
			}
 
		};
		form.add(nameField);

		
		add(form);
 
	}
	

}
