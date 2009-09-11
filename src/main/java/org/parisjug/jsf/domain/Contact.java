package org.parisjug.jsf.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

@Entity
@NamedQuery(name="Contact.findAll", query="select c from Contact c")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String firstName;
    
    private String lastName;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;


    private String email;
            

     /* GETTER AND SETTER */


    public Contact() {
       
    }

    public Contact(String lastName, String firstName, Date birthDate, String email) {
       this.lastName = lastName;
       this.firstName = firstName;
       this.birthDate = birthDate;
       this.email = email;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   

    

    
}
