package com.ekiras.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ekiras
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastUpdated;

    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    private Employee employee;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                ", address='" + address + '\'' +
                ", employee=" + employee +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
