package apaw.ecp2.business.models.daos;

import java.util.List;

import apaw.ecp2.business.models.entities.Theme;

public interface ThemeDao extends GenericDao<Theme, Integer> {

	Theme findByName(String themeName);

	List<String> findAllNames();

}
