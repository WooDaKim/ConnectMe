package com.project.ConnectMe.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Album {

    @Id
    private long id;

    private String title;
    private String image;
    private String writing;

    @Builder
    public Album(long id, String title, String image, String writing) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.writing = writing;
    }
}
