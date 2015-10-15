package apaw.ecp2.presentation.presenters;

import apaw.ecp2.business.controllers.BusinessController;
import apaw.ecp2.presentation.models.Model;

public class ThemeManagerPresenter {

	public String process(Model model) {
		return "ThemeManagerView";
	}

	public String createTheme(Model model, String themeName) {
		new BusinessController().createTheme(themeName);
		return "ThemeManagerView";
	}

}
