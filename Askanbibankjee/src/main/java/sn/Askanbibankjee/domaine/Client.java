package sn.Askanbibankjee.domaine;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private String tel;
	private String typepiece;
	private String numpiece;
	private String genre;
	private String sitmat;
	private String nature;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client( String nom, String prenom, String adresse, String tel, String typepiece,
			String numpiece, String genre, String sitmat, String nature) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.typepiece = typepiece;
		this.numpiece = numpiece;
		this.genre = genre;
		this.sitmat = sitmat;
		this.nature = nature;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTypepiece() {
		return typepiece;
	}

	public void setTypepiece(String typepiece) {
		this.typepiece = typepiece;
	}

	public String getNumpiece() {
		return numpiece;
	}

	public void setNumpiece(String numpiece) {
		this.numpiece = numpiece;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSitmat() {
		return sitmat;
	}

	public void setSitmat(String sitmat) {
		this.sitmat = sitmat;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
	
	
	
	
	
	

}
