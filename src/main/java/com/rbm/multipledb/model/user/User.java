package com.rbm.multipledb.model.user;

import javax.persistence.*;

/**
 * Created by rakshabm on 2020-03-16
 **/
@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;
    public User() {
        // TODO Auto-generated constructor stub
    }
    public User(String string, String string2) {
        // TODO Auto-generated constructor stub
        name = string;
        email = string2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, name='%s', email='%s']",
                id, name, email);
    }


}
