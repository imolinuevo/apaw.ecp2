package apaw.ecp2.business.controllers;

import apaw.ecp2.business.models.daos.DaoFactory;
import apaw.ecp2.business.models.entities.Theme;
import apaw.ecp2.business.models.entities.Vote;
import apaw.ecp2.business.views.VoteTransferObject;

public class BusinessController {

	private static int idTheme = 0;

	private static int idVote = 0;

	public void createTheme(String themeName) {
		DaoFactory.getFactory().getThemeDao()
				.create(new Theme(idTheme, themeName));
		idTheme++;
	}

	public void voteTheme(VoteTransferObject voteTransferObject) {
		DaoFactory
				.getFactory()
				.getVoteDao()
				.create(new Vote(idVote, voteTransferObject.getValue(),
						DaoFactory.getFactory().getThemeDao()
								.findByName(voteTransferObject.getThemeName())));
		idVote++;
	}

}
