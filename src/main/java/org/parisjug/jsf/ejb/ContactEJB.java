package org.parisjug.jsf.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.parisjug.jsf.domain.Contact;

@Stateless
@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
public class ContactEJB {

    @PersistenceContext(unitName="contactPU")
    private EntityManager entityManager;

    public Contact create() {
        return new Contact();
    }

    public void save(Contact contact) {
        entityManager.persist(contact);
        System.out.println("Contact ajoute : "+contact);
    }

    public void delete(Contact contact) {
        contact = entityManager.merge(contact);
        entityManager.remove(contact);
    }

    public Contact update(Contact book) {
        return entityManager.merge(book);
    }

    public Contact find(Integer id) {
        return entityManager.find(Contact.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> getAll() {
        Query query = entityManager.createNamedQuery("Contact.findAll");
        List<Contact> result = (List<Contact>) query.getResultList();
        return result;
    }
}
