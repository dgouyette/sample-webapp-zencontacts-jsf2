package org.parisjug.jsf.controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import org.parisjug.jsf.constants.Navigation;
import org.parisjug.jsf.domain.Contact;
import org.parisjug.jsf.ejb.ContactEJB;

@ManagedBean
@RequestScoped
public class ContactManagedBean {

    private Contact currentContact;

    @EJB
    private ContactEJB contactEJB;


    /** Data liés au tableau**/
    private DataModel<Contact> contacts;

    /**
     * Initialise les donnees pour l'écran
     */
    public ContactManagedBean() {
        currentContact = new Contact();

    }

    @PostConstruct
    public void init() {
        reload();
    }

    public void reload() {
        this.contacts = new ListDataModel<Contact>(contactEJB.getAll());

    }

    public String addContact() {
        contactEJB.save(currentContact);
        reload();

        currentContact = new Contact();
        return Navigation.ADD_CONTACT_SUCCESS;
    }

    //Coder ici la suppression
    /** GETTER AND SETTER **/
    public DataModel<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(DataModel<Contact> contacts) {
        this.contacts = contacts;
    }

    public Contact getCurrentContact() {
        return currentContact;
    }

    public void setCurrentContact(Contact currentContact) {
        this.currentContact = currentContact;
    }
}
