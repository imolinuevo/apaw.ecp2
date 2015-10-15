package apaw.ecp2.business.controllers;

import java.util.ArrayList;
import java.util.List;

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

	public List<Theme> showThemes() {
		return DaoFactory.getFactory().getThemeDao().findAll();
	}

	public List<VoteTransferObject> showAverage() {
		List<Theme> themes = DaoFactory.getFactory().getThemeDao().findAll();
		List<Vote> votes = DaoFactory.getFactory().getVoteDao().findAll();
		List<VoteTransferObject> transferObjects = new ArrayList<VoteTransferObject>();
		for (Theme theme : themes) {
			int total = 0;
			int count = 0;
			int result = 0;
			for (Vote vote : votes) {
				if (vote.getTheme().getName().equals(theme.getName())) {
					total += vote.getVote();
					count++;
				}
			}
			if (count > 0) {
				result = total / count;
			}
			transferObjects.add(new VoteTransferObject(theme.getName(), Integer
					.toString(result)));
		}
		return transferObjects;
	}
}
