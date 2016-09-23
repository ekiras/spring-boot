package com.ekiras.domain;

import com.ekiras.domain.base.BaseDomain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author ekiras
 */
@Entity
@AttributeOverrides({
        @AttributeOverride(name = "id",column = @Column(name = "departmentId")),
        @AttributeOverride(name = "dateCreated",column = @Column(name = "created")),
        @AttributeOverride(name = "lastUpdated",column = @Column(name = "updated"))
})
public class Department extends BaseDomain {

    private String name;

    @Override
    public String toString() {
        return super.toString() + " Department{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
