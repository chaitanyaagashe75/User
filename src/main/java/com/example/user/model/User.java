package com.example.user.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    Long id ;
    String name;
    String password;

    public User(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
