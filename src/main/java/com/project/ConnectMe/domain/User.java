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

    private String uid;
    private String pwd;
    private String name;
    private String phone;
    private String bloodType;





}
