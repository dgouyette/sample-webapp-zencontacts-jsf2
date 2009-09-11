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
    
    private String name;
    
    private String forname;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;

<<<<<<< .mine
    private String email;
=======
	private Date birthDate;
>>>>>>> .r562

    public Contact() {
       
    }

<<<<<<< .mine
    /* GETTER AND SETTER */
=======
	public Contact() {
		super();
		birthDate = new Date();
	}
>>>>>>> .r562

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

    public String getForname() {
        return forname;
    }

<<<<<<< .mine
    public void setForname(String forname) {
        this.forname = forname;
    }
=======
	public Date getBirthDate() {
		return birthDate;
	}
>>>>>>> .r562

<<<<<<< .mine
    public long getId() {
        return id;
    }
=======
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
>>>>>>> .r562

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    
}
