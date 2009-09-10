package org.parisjug.jsf.domain;

import java.util.Date;

public class Contact {

	private String name;

	private String forname;

	private Date birthDate;

	private String email;

	public Contact() {
		super();
		birthDate = new Date();
	}

	public Contact(String name, String forname, Date birthDate, String email) {
		super();
		this.name = name;
		this.forname = forname;
		this.birthDate = birthDate;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
