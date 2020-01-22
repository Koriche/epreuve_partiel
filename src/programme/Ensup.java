package programme;

public class Ensup {

	private String nom, mail, adresse, telephone, directeur;
	
	public Ensup(String nom, String mail, String adresse, String telephone, String directeur) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.adresse = adresse;
		this.telephone = telephone;
		this.directeur = directeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDirecteur() {
		return directeur;
	}

	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
}
