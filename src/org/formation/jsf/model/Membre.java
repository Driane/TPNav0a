package org.formation.jsf.model;

public class Membre {

	private String login, password;
	private int age;
	private Genre genre;

	public Membre() {
		super();
	}

	public Membre(String login, String password, int age, Genre genre) {
		super();
		this.login = login;
		this.password = password;
		this.age = age;
		this.genre = genre;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
