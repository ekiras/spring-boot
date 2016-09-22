package com.ekiras.domain;

import com.ekiras.domain.base.BaseDomain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author ekiras
 */
@Entity
@AttributeOverride(name = "id",column = @Column(name = "userId"))
public class User extends BaseDomain{

    private String email;
    private String name;
    private String password;

    @Override
    public String toString() {
        return super.toString()+" :: User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
