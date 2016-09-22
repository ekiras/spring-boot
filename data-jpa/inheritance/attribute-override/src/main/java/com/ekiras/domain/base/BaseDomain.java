package com.ekiras.domain.base;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ekiras
 */
@MappedSuperclass
public class BaseDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date dateCreated;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastUpdated;

    @Override
    public String toString() {
        return "BaseDomain{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
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
}
