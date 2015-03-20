package com.haulmont.sampler.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|name,lastName")
@Table(name = "SAMPLER_CUSTOMER")
@Entity(name = "sampler$Customer")
public class Customer extends StandardEntity {
    @Column(name = "NAME", length = 50, nullable = false)
    protected String name;

    @Column(name = "LAST_NAME", length = 100, nullable = false)
    protected String lastName;

    @Column(name = "AGE")
    protected Integer age;

    private static final long serialVersionUID = -3420505556417816206L;


    @Column(name = "ACTIVE", nullable = false)
    protected Boolean active = false;

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getActive() {
        return active;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }


}