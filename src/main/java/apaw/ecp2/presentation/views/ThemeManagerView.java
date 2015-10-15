package apaw.ecp2.presentation.views;

import java.util.Map.Entry;

import apaw.ecp2.presentation.models.Model;

public class ThemeManagerView implements View {

	@Override
	public void show(Model model) {
		System.out.println("Theme Manager Page");
		System.out.print("   Temas: [");
		for (Entry<String, Object> e : model.getMap().entrySet()) {
			System.out.print("[" + e.getKey() + "]");
		}
		System.out.println("]");

	}

}
