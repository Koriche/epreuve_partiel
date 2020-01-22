package programme;

public class Cours {

	private String theme;
	private int nombreheures;
	
	public Cours(String theme, int nombreheures) {
		super();
		this.theme = theme;
		this.nombreheures = nombreheures;
	}

	// GETTERS SETTERS //
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getNbHeure() {
		return nombreheures;
	}

	public void setNbHeure(int nombreheures) {
		this.nombreheures = nombreheures;
	}
}
