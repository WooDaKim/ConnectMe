package com.project.ConnectMe.dto;


import lombok.Builder;

@Builder
public class UserDto {
    private long id; //PID

    private String name;
    private String phone;
    private String bloodType;


}
