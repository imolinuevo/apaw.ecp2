package apaw.ecp2.presentation.views;

import apaw.ecp2.presentation.models.Model;

public class ErrorView implements View {

	@Override
	public void show(Model model) {
		System.out.println("Error \n   Lo siento, petición incorrecta. "
				+ model.get("error"));
	}

}
