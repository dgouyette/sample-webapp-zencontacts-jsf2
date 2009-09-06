package org.parisjug.jsf.beans;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;

import javax.faces.context.FacesContext;

import org.parisjug.jsf.domain.Contact;

//@ManagedBean(name="createContactBean")
//// inutile, car le scope par defaut est deja request
//@RequestScoped
public class CreateContactBean {

	private ListContactsBean listContactsBean;

	private Contact currentContact;

	public CreateContactBean() {
		super();
		currentContact = new Contact();
	}

	public Contact getCurrentContact() {
		return currentContact;
	}

	public void setCurrentContact(Contact currentContact) {
		this.currentContact = currentContact;
	}

	public ListContactsBean getListContactsBean() {
		return listContactsBean;
	}

	public void setListContactsBean(ListContactsBean listContactsBean) {
		this.listContactsBean = listContactsBean;
	}

	public String addContact() {
		listContactsBean.getContactsList().add(currentContact);
		return "ListContactPage";
	}
}
