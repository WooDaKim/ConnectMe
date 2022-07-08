package com.project.ConnectMe.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class User {

    @Id
    private long id; //PID

    private String name;
    private String phone;
    private String bloodType;

    @Builder
    public User(long id, String name, String phone, String bloodType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.bloodType = bloodType;
    }
}
