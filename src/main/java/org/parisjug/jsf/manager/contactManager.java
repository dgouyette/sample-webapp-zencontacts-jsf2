package org.parisjug.jsf.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.parisjug.jsf.domain.Contact;

@ManagedBean
@ApplicationScoped
public class contactManager {

    private List<Contact> contactsList;

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
