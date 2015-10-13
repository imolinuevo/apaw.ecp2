package apaw.ecp2.presentation.presenters;

import apaw.ecp2.presentation.models.Model;

public class VotingPresenter {

	public String process(Model model) {
		model.put("log", "VotingPresenter:process");
		return "VotingView";
	}

	public String voteTheme(Model model) {
		model.put("log", "VotingPresenter:voteTheme");
		// TODO
		return "VotingView";
	}

	public String showThemeManager(Model model) {
		model.put("log", "VotingPresenter:showThemeManager");
		// TODO
		return "VotingView";
	}

}
