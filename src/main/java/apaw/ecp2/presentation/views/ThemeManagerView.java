package apaw.ecp2.presentation.views;

import apaw.ecp2.presentation.models.Model;

public class ThemeManagerView implements View{

	@Override
	public void show(Model model) {
		System.out.println("ThemeManagerView");
        System.out.println("   " + model.get("log"));
	}

}
