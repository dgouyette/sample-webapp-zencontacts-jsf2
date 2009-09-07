package org.parisjug.jsf.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.parisjug.jsf.domain.Contact;

public class ListContactsBean {

	private List<Contact> contactsList;

	public ListContactsBean() {
		super();
		contactsList = new ArrayList<Contact>();
		Contact dgouyette = new Contact("Gouyette", "Damien", new Date(),
				"damien@gouyette.fr");
		contactsList.add(dgouyette);
		Contact fpetitit = new Contact("Petitit", "François", new Date(),
				"francois@petitit.fr");
		contactsList.add(fpetitit);
	}

	public List<Contact> getContactsList() {
		return contactsList;
	}
}
