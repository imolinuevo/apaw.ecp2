package apaw.ecp2.presentation.presenters;

import apaw.ecp2.business.controllers.BusinessController;
import apaw.ecp2.business.views.VoteTransferObject;
import apaw.ecp2.presentation.models.Model;

public class VotingPresenter {

	public String process(Model model) {
		return "VotingView";
	}

	public String voteTheme(Model model, VoteTransferObject voteTransferObject) {
		new BusinessController().voteTheme(voteTransferObject);
		return "VotingView";
	}

}
