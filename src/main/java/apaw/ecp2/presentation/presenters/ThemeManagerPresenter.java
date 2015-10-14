package apaw.ecp2.presentation.presenters;

import apaw.ecp2.presentation.models.Model;

public class ThemeManagerPresenter {

	public String process(Model model) {
		model.put("log", "ThemeManager:process");
		return "ThemeManagerView";
	}

	public String createTheme(Model model) {
		model.put("log", "ThemeManager:createTheme");
		// TODO
		return "ThemeManagerView";
	}

}
