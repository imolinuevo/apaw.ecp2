package apaw.ecp2.presentation.views;

import java.util.Map.Entry;

import apaw.ecp2.business.views.VoteTransferObject;
import apaw.ecp2.presentation.models.Model;

public class VotingView implements View {

	@Override
	public void show(Model model) {
		System.out.println("Voting Page");
		System.out.print("   Temas: [");
		for (Entry<String, Object> e : model.getMap().entrySet()) {
			System.out.print("["
					+ ((VoteTransferObject) e.getValue()).getThemeName() + ":"
					+ ((VoteTransferObject) e.getValue()).getValue() + "]");
		}
		System.out.println("]");
	}
}
