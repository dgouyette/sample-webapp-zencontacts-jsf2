package org.parisjug.jsf.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.component.UIInput;
import org.parisjug.jsf.constants.Navigation;
import org.parisjug.jsf.domain.Contact;

@ManagedBean
@SessionScoped
public class ContactManagedBean {

    private Contact currentContact;
    private List<Contact> listContact;
    private UIInput inputTextName;
    private UIInput inputTextForname;

    public ContactManagedBean() {
        listContact = new ArrayList<Contact>();
        listContact.add(new Contact("Gouyette", "Damien", new Date(), "damien.gouyette@gmail.com"));
        listContact.add(new Contact("Petitit", "Francois", new Date(), "francois@petitit.fr"));
        currentContact = new Contact();
    }

    public String getFornameStyle() {
        if (getInputTextForname().isValid()) {
            return "infoMessage";
        } else {
            return "errorMessage";
        }
    }

    public String getNameStyle() {
        if (getInputTextName().isValid()) {
            return "infoMessage";
        } else {
            return "errorMessage";
        }
    }

    public String addContact() {
        listContact.add(currentContact);
        currentContact = new Contact();
        return Navigation.ADD_CONTACT_SUCCESS;
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

    /**
     * @return the inputTextName
     */
    public UIInput getInputTextName() {
        return inputTextName;
    }

    /**
     * @param inputTextName the inputTextName to set
     */
    public void setInputTextName(UIInput inputTextName) {
        this.inputTextName = inputTextName;
    }

    /**
     * @return the inputTextForname
     */
    public UIInput getInputTextForname() {
        return inputTextForname;
    }

    /**
     * @param inputTextForname the inputTextForname to set
     */
    public void setInputTextForname(UIInput inputTextForname) {
        this.inputTextForname = inputTextForname;
    }

}
