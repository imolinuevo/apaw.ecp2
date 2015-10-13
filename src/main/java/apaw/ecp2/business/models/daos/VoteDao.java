package apaw.ecp2.business.models.daos;

import java.util.List;

import apaw.ecp2.business.models.entities.Theme;
import apaw.ecp2.business.models.entities.Vote;

public interface VoteDao extends GenericDao<Vote, Integer> {

	List<Vote> findByTheme(Theme theme);

}
