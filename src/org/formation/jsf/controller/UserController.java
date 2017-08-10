package org.formation.jsf.controller;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;

import org.formation.jsf.model.Genre;
import org.formation.jsf.model.Membre;

@ManagedBean
public class UserController {

	private String login, password;
	private Membre membre = new Membre();
	private static Map<String, Membre> users;

	static {
		users = new HashMap<String, Membre>();
		users.put("admin", new Membre("admin", "admin", 12, Genre.HOMME));
	}

	public UserController() {	}

	public String checkPassword() {
		Membre m = users.get(login); 
		if (m != null && m.getPassword().equals(password)) {

			return "topics";
		}
		return "";
	}

	public String doInscription() {
		if (membre.getLogin().equals(""))
			return "";
		users.put(membre.getLogin(), membre);

		return "topics";
	}

	public String logout() {

		return "accueil";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

}
