package org.formation.jsf.model;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8670571966897434721L;

	private long id;

	private Membre auteur;
	private Date date;
	private String sujet;

	private String content;

	public Message() {
		super();
	}

	public Message(long id, Membre auteur, Date date, String sujet, String content) {
		super();
		this.id = id;
		this.auteur = auteur;
		this.date = date;
		this.sujet = sujet;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Membre getAuteur() {
		return auteur;
	}

	public void setAuteur(Membre auteur) {
		this.auteur = auteur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
