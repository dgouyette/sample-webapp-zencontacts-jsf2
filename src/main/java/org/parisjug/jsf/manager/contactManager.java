package org.parisjug.jsf.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import org.parisjug.jsf.domain.Contact;

public class contactManager {

    private List<Contact> contactsList;
    private static contactManager contactManagerInstance;

    public static synchronized contactManager getInstance() {
        if (contactManagerInstance == null) {
            contactManagerInstance = new contactManager();
        }
        return contactManagerInstance;
    }

    @PostConstruct
    private void init() {
        contactsList = new ArrayList<Contact>();
        contactsList.add(new Contact("Gouyette", "Damien", new Date(), "damien.gouyette@gmail.com"));
        contactsList.add(new Contact("Petitit", "Francois", new Date(), "francois@petitit.fr"));
    }

    public List<Contact> findAll() {
        return contactsList;
    }

    public void remove(Contact contactIn) {
        contactsList.remove(contactIn);
    }

    public void create(Contact contactIn) {
        contactsList.add(contactIn);
    }

    public Contact findById(int id) {
        return contactsList.get(id);
    }
}
