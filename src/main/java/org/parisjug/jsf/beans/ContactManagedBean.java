package org.parisjug.jsf.beans;

import org.parisjug.jsf.manager.contactManager;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.parisjug.jsf.domain.Contact;

@ManagedBean
@RequestScoped
public class ContactManagedBean {

    @Resource
    private contactManager contactManager;
    
    private Contact currentContact;

    @PostConstruct
    public void init() {
        currentContact = new Contact();

    }


    public String addContact() {
        contactManager.create(currentContact);
        return "ListContactPage";
    }

    /** GETTER AND SETTER **/
    public Contact getCurrentContact() {
        return currentContact;
    }

    public void setCurrentContact(Contact currentContact) {
        this.currentContact = currentContact;
    }

   
}
