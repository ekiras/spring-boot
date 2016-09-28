package com.ekiras.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ekiras
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastUpdated;

    private String email;
    private String name;
    private String password;
    
    @OneToOne(mappedBy = "employee",optional = false,cascade = CascadeType.ALL)
    private Address address;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
