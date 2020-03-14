package entites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="personne", namespace="http://ferhi.com/personne")
@XmlAccessorType(XmlAccessType.FIELD)
public class Personne {
	
	@XmlElement(name="identifiant", namespace="http://ferhi.com/personne")
	private int identifiant;
	@XmlElement(name="prenom", namespace="http://ferhi.com/personne")
	private String prenom;
	@XmlElement(name="nom", namespace="http://ferhi.com/personne")
	private String nom;
	public Personne() {
		super();
	}
	public Personne(int identifiant, String prenom, String nom) {
		super();
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
