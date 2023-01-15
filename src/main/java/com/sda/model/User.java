package com.sda.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter


public class User {
    @Id
    @Column(name = "USERNAME")
    private  String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "AGE")
    private int age;
    @Column(name = "E-MAIL")
    private String email;


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
