package org.formation.jsf.validator;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class TopicValidator implements Validator {
	ResourceBundle bundle;

	public TopicValidator() {
		bundle = ResourceBundle.getBundle("i18n/topics");
	}

	@Override
	public void validate(FacesContext facesContext, UIComponent arg1, Object topicTitle) throws ValidatorException {
		String topic = (String) topicTitle;
		String mots  = bundle.getString("mots");
		String[] arrayMots = mots.split(";");
		for(String mot : arrayMots) {
			if(mot.equalsIgnoreCase(topic)) {
				ResourceBundle bundleMsg = facesContext.getApplication().getResourceBundle(facesContext, "messages");
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,bundleMsg.getString("error.prohibitedWords"), bundleMsg.getString("error.prohibitedWords")));
			}
		}
	}

}
