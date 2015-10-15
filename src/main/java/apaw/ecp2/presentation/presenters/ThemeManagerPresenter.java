package apaw.ecp2.presentation.presenters;

import java.util.List;

import apaw.ecp2.business.controllers.BusinessController;
import apaw.ecp2.business.models.entities.Theme;
import apaw.ecp2.presentation.models.Model;

public class ThemeManagerPresenter {

	public String process(Model model) {
		return "ThemeManagerView";
	}

	public String createTheme(Model model, String themeName) {
		BusinessController businessController = new BusinessController();
		businessController.createTheme(themeName);
		List<Theme> themes = businessController.showThemes();
		for (Theme theme : themes) {
			model.put(theme.getName(), theme);
		}
		return "ThemeManagerView";
	}

}
