package apaw.ecp2.presentation.frontController;

import apaw.ecp2.business.views.VoteTransferObject;
import apaw.ecp2.presentation.models.Model;
import apaw.ecp2.presentation.presenters.ThemeManagerPresenter;
import apaw.ecp2.presentation.presenters.VotingPresenter;
import apaw.ecp2.presentation.views.ErrorView;
import apaw.ecp2.presentation.views.ThemeManagerView;
import apaw.ecp2.presentation.views.View;
import apaw.ecp2.presentation.views.VotingView;
import web.http.HttpRequest;
import web.http.HttpResponse;

public class Dispatcher {

	public void doGet(HttpRequest request, HttpResponse response) {
		Model model = new Model();
		String presenter = request.getPath() + "Presenter";
		String nextView = request.getPath() + "View";

		switch (presenter) {
		case "VotingPresenter":
			VotingPresenter votingPresenter = new VotingPresenter();
			nextView = votingPresenter.process(model);
			break;
		case "ThemeManagerPresenter":
			ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
			nextView = themeManagerPresenter.process(model);
			break;
		}
		this.show(nextView, model);
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		Model model = new Model();
		String controller = request.getPath() + "Presenter";
		String action = request.getParams().get("action");
		String nextView = request.getPath() + "View";

		switch (controller) {
		case "VotingPresenter":
			VotingPresenter votingPresenter = new VotingPresenter();
			if ("voteTheme".equals(action)) {
				nextView = votingPresenter
						.voteTheme(model, new VoteTransferObject(request
								.getParams().get("themeName"), request
								.getParams().get("value")));
			} else {
				model.put("error", "Acción no permitida: " + action);
			}
			break;
		case "ThemeManagerPresenter":
			ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
			if ("createTheme".equals(action)) {
				nextView = themeManagerPresenter.createTheme(model, request
						.getParams().get("themeName"));
			} else {
				model.put("error", "Acción no permitida: " + action);
			}
			break;
		}
		this.show(nextView, model);

	}

	private void show(String nextView, Model model) {
		View view;
		switch (nextView) {
		case "VotingView":
			view = new VotingView();
			break;
		case "ThemeManagerView":
			view = new ThemeManagerView();
			break;
		default:
			view = new ErrorView();
			model.put("error", "Vista no encontrada: " + nextView);
		}
		view.show(model);
	}

}
