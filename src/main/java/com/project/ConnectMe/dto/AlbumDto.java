package com.project.ConnectMe.dto;

import lombok.Builder;

@Builder
public class AlbumDto {
    private long id;

    private String title;
    private String image;
    private String writing;

}
