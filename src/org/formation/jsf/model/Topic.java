package org.formation.jsf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Topic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3899639475943780657L;

	public Topic() {
		super();
	}

	public Topic(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	private long id;
	private String title;

	private String description;

	private List<Message> messages = new ArrayList<Message>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public void addMessage(Message m) {
		messages.add(m);
	}

}
