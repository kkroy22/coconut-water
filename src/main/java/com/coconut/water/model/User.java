package com.coconut.water.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "user_db")
public class User {
    @Id
    String id = UUID.randomUUID().toString();

    public User() {
    }

    @Column(name = "name",nullable = false)
    String name ="";

    public User(String id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Column(name = "dob",nullable = false)
    String dob="";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
