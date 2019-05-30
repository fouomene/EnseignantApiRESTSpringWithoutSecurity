package org.isj.gestionenseignant.api.domaine.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enseignant")
public class Enseignant {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idEns;

	private String nom;
	private String ue;
	private String telephone;
	private String urlImage;

	public Enseignant() {
		super();
	}

	public Enseignant(long idEns, String nom, String ue, String telephone, String urlImage) {
		super();
		this.idEns = idEns;
		this.nom = nom;
		this.ue = ue;
		this.telephone = telephone;
		this.urlImage = urlImage;
	}

	public long getIdEns() {
		return idEns;
	}

	public void setIdEns(long idEns) {
		this.idEns = idEns;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUe() {
		return ue;
	}

	public void setUe(String ue) {
		this.ue = ue;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	@Override
	public String toString() {
		return "Enseignant [idEns=" + idEns + ", nom=" + nom + ", ue=" + ue + ", telephone=" + telephone + "]";
	}


}
