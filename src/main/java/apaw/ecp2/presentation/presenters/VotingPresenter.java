package apaw.ecp2.presentation.presenters;

import java.util.List;

import apaw.ecp2.business.controllers.BusinessController;
import apaw.ecp2.business.views.VoteTransferObject;
import apaw.ecp2.presentation.models.Model;

public class VotingPresenter {

	public String process(Model model) {
		return "VotingView";
	}

	public String voteTheme(Model model, VoteTransferObject voteTransferObject) {
		BusinessController businessController = new BusinessController();
		businessController.voteTheme(voteTransferObject);
		List<VoteTransferObject> averages = businessController.showAverage();
		for (VoteTransferObject transferObject : averages) {
			model.put(transferObject.getThemeName(), transferObject);
		}
		return "VotingView";
	}

}
