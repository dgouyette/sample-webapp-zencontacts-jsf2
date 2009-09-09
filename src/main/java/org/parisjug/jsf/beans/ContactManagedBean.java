package org.parisjug.jsf.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import org.parisjug.jsf.domain.Contact;

@ManagedBean
@SessionScoped
public class ContactManagedBean {

    private Contact currentContact;

    private List<Contact> listContact;

    public ContactManagedBean(){
        listContact = new ArrayList<Contact>();
        listContact.add(new Contact("Gouyette", "Damien", new Date(), "damien.gouyette@gmail.com"));
        listContact.add(new Contact("Petitit", "Francois", new Date(), "francois@petitit.fr"));
        currentContact = new Contact();
    }

    

    public String addContact() {
        listContact.add(currentContact);
        return "ListContactPage";
    }

   /** GETTER AND SETTER **/

    public Contact getCurrentContact() {
        return currentContact;
    }

    public void setCurrentContact(Contact currentContact) {
        this.currentContact = currentContact;
    }

    public List<Contact> getListContact() {
        return listContact;
    }

    public void setListContact(List<Contact> listContact) {
        this.listContact = listContact;
    }

   

   
   
}
