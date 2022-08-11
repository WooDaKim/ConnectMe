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

    //성적표  ==> 과목명이 바뀔수도 있으니 입력을 받아서 숫자를 입력하는 걸로 바꿔보자
    private Subject korean;
    private Subject english;
    private Subject math;
    private Subject social;
    private Subject science;


}
