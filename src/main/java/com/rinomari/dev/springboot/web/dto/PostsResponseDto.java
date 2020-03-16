package com.rinomari.dev.springboot.web.dto;

import com.rinomari.dev.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTilte();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
