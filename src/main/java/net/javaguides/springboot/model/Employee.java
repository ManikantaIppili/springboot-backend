package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="employees")
public class Employee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
    @Column(name="first_name")
	private String Firstname;
    @Column(name="last_name")
	private String Lastname;
    @Column(name="email_id")
	private String Emailid;
	
	public Employee() {
		
	}
	
	public Employee(String firstname, String lastname, String emailid) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Emailid = emailid;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	
	
}
