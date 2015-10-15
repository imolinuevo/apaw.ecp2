package apaw.ecp2.business.views;

public class VoteTransferObject {

	private String themeName;

	private int value;

	public VoteTransferObject(String themeName, String value) {
		this.themeName = themeName;
		this.value = Integer.parseInt(value);
	}

	public String getThemeName() {
		return themeName;
	}

	public int getValue() {
		return value;
	}

}
