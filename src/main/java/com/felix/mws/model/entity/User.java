package com.felix.mws.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by fsoewito on 2/20/2016.
 */
@Entity
@Table(name = "data_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {
    @Id
    @SequenceGenerator(
            name = "data_user_id_seq",
            sequenceName = "data_user_id_seq")
    @GeneratedValue(
            generator = "data_user_id_seq",
            strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
