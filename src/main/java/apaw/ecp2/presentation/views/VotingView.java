package apaw.ecp2.presentation.views;

import apaw.ecp2.presentation.models.Model;

public class VotingView implements View{

	@Override
	public void show(Model model) {
		System.out.println("VotingView");
        System.out.println("   " + model.get("log"));
	}

}
